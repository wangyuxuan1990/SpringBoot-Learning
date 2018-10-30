package com.wangyuxuan.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class HelloController {

    @ApiIgnore
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
