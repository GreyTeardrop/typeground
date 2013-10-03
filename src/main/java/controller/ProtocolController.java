package controller;

import constant.Urls;
import domain.Protocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.ProtocolRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class ProtocolController {

    ////////////////////////////////////////////////
    // ATTRIBUTES

    @Autowired
    private ProtocolRepository protocolRepository;

    ////////////////////////////////////////////////
    // METHODS

    @ResponseBody
    @RequestMapping(value = Urls.PROTOCOL_API, method = RequestMethod.POST)
    public String createProtocol(@RequestBody Protocol protocol,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws IOException {
        String newProtocolId = protocolRepository.addProtocol(protocol);
        String protocolUrl = request.getContextPath() + Urls.PROTOCOL_API + '/' + newProtocolId;

        response.setStatus(HttpStatus.CREATED.value());
        response.sendRedirect(protocolUrl);

        return protocolUrl;
    }

    @ResponseBody
    @RequestMapping(value = Urls.PROTOCOL_API, method = RequestMethod.GET)
    public List<Protocol> getProtocolList() {
        return protocolRepository.getAll();
    }

    @ResponseBody
    @RequestMapping(value = Urls.PROTOCOL_API_TEMPLATE, method = RequestMethod.GET)
    public Protocol getProtocol(@PathVariable String id) {
        return protocolRepository.getById(id);
    }

    @RequestMapping(value = Urls.PROTOCOL_API_TEMPLATE, method = RequestMethod.PUT)
    public void updateProtocol(@PathVariable String id, @RequestBody Protocol protocol) {
        protocol.setId(id);
        protocolRepository.updateProtocol(protocol);
    }
}
