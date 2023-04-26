package com.nosin.fullstackbackend.controller;

import com.nosin.fullstackbackend.model.User;
import com.nosin.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser()
}
