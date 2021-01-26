package com.Sedes.SedesApp.controller;


import com.Sedes.SedesApp.model.User;
import com.Sedes.SedesApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable long id) {
        return userService.getUser(id);
    }
}
