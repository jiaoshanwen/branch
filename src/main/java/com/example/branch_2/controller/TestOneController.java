package com.example.branch_2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOneController {

    @RequestMapping("/say")
    public String say(){
        return "hello world!";
    }
}
