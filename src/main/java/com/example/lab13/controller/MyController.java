package com.example.lab13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/lab13")
    public String hello(){
        return "hello, 王贵正12011425";
    }
}

