package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public ModelAndView defOutput() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        System.out.println("Im here!!!Default");
        return modelAndView;
    }

}
