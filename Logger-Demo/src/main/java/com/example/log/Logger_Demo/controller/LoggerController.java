package com.example.log.Logger_Demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoggerController {
    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @GetMapping("/welcome")
    public String getMessage(@RequestParam String name) {

        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return new String("Welcome, "+name);
    }

}
