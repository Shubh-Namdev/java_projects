package com.example.actuator.Spring_Actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcutatorController {

    @GetMapping("/actuator/vishwa")
    public String getName() {
        return new String("Vishwas");
    }
}
