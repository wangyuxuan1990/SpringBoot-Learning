package com.wangyuxuan.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/")
    public String hello(ModelMap map){
        map.addAttribute("host","王宇轩学习Spring Boot");
        return "index";
    }
}
