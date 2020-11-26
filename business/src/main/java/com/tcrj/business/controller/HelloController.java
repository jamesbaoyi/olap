package com.tcrj.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helloController")
public class HelloController {

    @GetMapping("/sayHello")
    private String sayHello() {
        return "hello world";
    }
}
