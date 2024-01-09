package com.example.springboot03web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// templates 目录下的所有页面，只能通过 controller 来进行跳转；
// 需要模板引擎的支持
@Controller
public class IndexController {
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","<b>this is thymeleaf demo</b>");
        return "test";
    }
}
