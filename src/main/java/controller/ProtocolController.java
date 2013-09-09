package controller;

import constant.Urls;
import domain.Protocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.ProtocolRepository;

@Controller
public class ProtocolController {

    ////////////////////////////////////////////////
    // ATTRIBUTES

    @Autowired
    private ProtocolRepository protocolRepository;

    ////////////////////////////////////////////////
    // METHODS

    @ResponseBody
    @RequestMapping(value = Urls.PROTOCOL, method = RequestMethod.PUT)
    public Protocol newProtocol() {
        String newProtocolId = protocolRepository.addProtocol(new Protocol());
        return protocolRepository.getById(newProtocolId);
    }

    @ResponseBody
    @RequestMapping(value = Urls.PROTOCOL_TEMPLATE, method = RequestMethod.GET)
    public Protocol getProtocol(@PathVariable String id) {
        return protocolRepository.getById(id);
    }

    @RequestMapping(value = Urls.PROTOCOL_UPDATE, method = RequestMethod.POST)
    public void updateProtocol(@ModelAttribute("protocol") Protocol protocol) {
        protocolRepository.updateProtocol(protocol);
    }
}
