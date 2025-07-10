package com.springprojects.SpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class SpringAppController {

    @GetMapping("/springapp")
    public String getMethodName(@RequestParam String name) {
        return new String("Hey !, I am Spring and you are "+name);
    }
}
