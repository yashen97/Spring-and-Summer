package com.yashen.not.a.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class greet {
    @RequestMapping("/F")
    public ModelAndView getPage(){return new ModelAndView("page1.html");}
    @RequestMapping("2ndpage")
    public ModelAndView getPage1(){return new ModelAndView("page2.html");}

}
