package controller;

import constant.Urls;
import constant.ViewIds;
import domain.Protocol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import repository.ProtocolRepository;

import javax.annotation.Resource;

@Controller
public class IndexController {

    ////////////////////////////////////////////////
    // ATTRIBUTES

    private ProtocolRepository protocolRepository;

    ////////////////////////////////////////////////
    // METHODS

    @RequestMapping(Urls.ROOT)
    public RedirectView index() {
        String newProtocolId = protocolRepository.addProtocol(new Protocol());
        return new RedirectView(createProtocolUrl(newProtocolId));
    }

    private String createProtocolUrl(String newProtocolId) {
        return Urls.PROTOCOL + "?id=" + newProtocolId;
    }

    @RequestMapping(Urls.PROTOCOL)
    public String loadProtocol(@RequestParam("id") String protocolId,
                               ModelMap mm) {
        mm.put("protocol", protocolRepository.getById(protocolId));
        return ViewIds.PROTOCOL;
    }

    @RequestMapping(value = Urls.SAVE_PROTOCOL, method = RequestMethod.POST)
    public RedirectView saveProtocol(@ModelAttribute("protocol") Protocol protocol) {
        protocolRepository.updateProtocol(protocol);
        return new RedirectView(createProtocolUrl(protocol.getId()));
    }

    ////////////////////////////////////////////////
    // SETTERS

    @Resource
    public void setProtocolRepository(ProtocolRepository protocolRepository) {
        this.protocolRepository = protocolRepository;
    }
}
