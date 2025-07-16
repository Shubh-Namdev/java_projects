package com.example.secure.Spring_Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/secure/{name}")
    public String getMessage(@PathVariable String name) {
        return new String("Hi, "+name+". You are with secured app.");
    }
}
