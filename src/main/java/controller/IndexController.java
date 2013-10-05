package controller;

import constant.Urls;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    ////////////////////////////////////////////////
    // ATTRIBUTES

    ////////////////////////////////////////////////
    // METHODS

    @RequestMapping({Urls.ROOT, Urls.NEW_PROTOCOL, Urls.PROTOCOL_TEMPLATE})
    public String index() {
        return "index";
    }

    ////////////////////////////////////////////////
    // SETTERS

}
