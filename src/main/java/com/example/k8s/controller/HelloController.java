package com.example.k8s.controller;


import cn.hutool.core.date.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String sayHello() {
        logger.info("hello world---->"+ DateUtil.now());
        return "hello, world";
    }
}
