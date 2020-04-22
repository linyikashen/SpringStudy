package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {

    @RequestMapping("/mvc")
    public String helloMvc() {
        System.out.println("来了");

        return "home";
    }

    @RequestMapping("/mv")
    @ResponseBody
    public String helloStr() {
        return "home";
    }

}
