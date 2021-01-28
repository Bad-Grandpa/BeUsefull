package com.Sedes.SedesApp.service;

import com.Sedes.SedesApp.model.User;
import com.Sedes.SedesApp.repisitory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(long id) {
        return userRepository.findById(id);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public User editUser(User user) {
        User userEdited = userRepository.findById(user.getId()).orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        userEdited.setLogin(user.getLogin());
        userEdited.setEmail(user.getEmail());
        userEdited.setPassword(user.getPassword());
        userEdited.setType(user.getType());
        return userEdited;
    }
}
