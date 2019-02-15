package com.zzq.order.ordering.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @developer Zhengquan Zhang
 * @Date 2019/2/15 22:02
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "This is Ordering system";
    }
}
