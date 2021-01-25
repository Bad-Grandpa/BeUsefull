package com.Sedes.SedesApp.service;

import com.Sedes.SedesApp.model.User;
import com.Sedes.SedesApp.repisitory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
