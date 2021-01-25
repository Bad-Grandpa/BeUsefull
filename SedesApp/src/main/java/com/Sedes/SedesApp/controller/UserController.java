package com.Sedes.SedesApp.controller;


import com.Sedes.SedesApp.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        throw new IllegalArgumentException("Not there yet!");
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        throw new IllegalArgumentException("Not there yet!");
    }
}
