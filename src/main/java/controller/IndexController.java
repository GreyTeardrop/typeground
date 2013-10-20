package controller;

import constant.ModelIds;
import constant.Urls;
import constant.ViewIds;
import domain.type.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class IndexController {

    ////////////////////////////////////////////////
    // ATTRIBUTES

    private MessageSource messageSource;

    ////////////////////////////////////////////////
    // METHODS

    @RequestMapping({Urls.ROOT, Urls.NEW_PROTOCOL, Urls.PROTOCOL_TEMPLATE})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView(ViewIds.INDEX);
        modelAndView.addObject(ModelIds.ASPECT_NAMES, Arrays.asList(Aspect.values()));
        return modelAndView;
    }

    ////////////////////////////////////////////////
    // SETTERS

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
