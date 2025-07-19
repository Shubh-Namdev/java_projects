package com.me.springsecuritydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/public-content")
    public String getSearchResults() {
        return new String("here are the results");
    }

    @GetMapping("/api/user-content")
    public String getUserDetails(@RequestParam String id) {
        return new String("Details for "+id+" are listed below");
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/api/admin-only")
    public String getAdminAuthoritiesName() {
        return new String("These are some comes under your access");
    }
}
