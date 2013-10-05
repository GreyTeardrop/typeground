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

    @RequestMapping(value = Urls.PROTOCOL_API, method = RequestMethod.POST)
    public @ResponseBody Protocol createProtocol() throws IOException {
        String newProtocolId = protocolRepository.addProtocol(new Protocol());
        return protocolRepository.getById(newProtocolId);
    }

    @RequestMapping(value = Urls.PROTOCOL_API, method = RequestMethod.GET)
    public @ResponseBody List<Protocol> getProtocolList() {
        return protocolRepository.getAll();
    }

    @RequestMapping(value = Urls.PROTOCOL_API_TEMPLATE, method = RequestMethod.GET)
    public @ResponseBody Protocol getProtocol(@PathVariable String id) {
        return protocolRepository.getById(id);
    }

    @RequestMapping(value = Urls.PROTOCOL_API_TEMPLATE, method = RequestMethod.POST)
    public @ResponseBody Protocol updateProtocol(@PathVariable String id, @RequestBody Protocol protocol) {
        protocolRepository.updateProtocol(protocol);
        return  protocolRepository.getById(protocol.getId());
    }

    @RequestMapping(value = Urls.PROTOCOL_API_TEMPLATE, method = RequestMethod.DELETE)
    public @ResponseBody void deleteProtocol(@PathVariable String id) {
        protocolRepository.deleteProtocol(id);
    }
}
