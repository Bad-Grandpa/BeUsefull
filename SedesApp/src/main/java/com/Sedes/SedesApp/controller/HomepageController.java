package com.Sedes.SedesApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Sedes mess";
    }

    @GetMapping("/secured")
    public String welcomeSecured() {
        return "Welcome to SedesSecured mess";
    }
}
