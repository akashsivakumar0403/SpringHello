package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.FirstSpringApplication;
@RestController
public class FirstSpringApplicationController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    

   
}