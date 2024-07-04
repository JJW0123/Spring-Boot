package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Service;

@RestController
public class Controller {
    String result;
    
    @GetMapping("/greeting")
    public String greeting() {
        result = Service.greeting();
        return result;
    }
}