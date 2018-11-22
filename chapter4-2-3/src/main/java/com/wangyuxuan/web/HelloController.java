package com.wangyuxuan.web;

import org.springframework.web.bind.annotation.*;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/22 11:08
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
