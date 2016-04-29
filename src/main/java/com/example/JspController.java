package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JspController {
    @RequestMapping("/")
    public ModelAndView hi(){
        ModelAndView modelAndView = new ModelAndView("hi");
        modelAndView.addObject("name","Dima");
        return modelAndView;
    }
}
