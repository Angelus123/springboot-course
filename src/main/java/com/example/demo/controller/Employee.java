package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
    
    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
}
