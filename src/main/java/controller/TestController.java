package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printTestMessageGet() {
        System.out.println("Im here!!!!!Get");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.getModel().put("attribute", "message from attribute get");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView printTestMessagePos() {
        System.out.println("Im here!!!!!Post");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.getModel().put("attribute", "message from attribute post");
        return modelAndView;
    }

}
