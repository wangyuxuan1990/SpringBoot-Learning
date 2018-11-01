package com.wangyuxuan.web;

import com.wangyuxuan.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception{
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException{
        throw new MyException("发生自己定义的错误");
    }
}
