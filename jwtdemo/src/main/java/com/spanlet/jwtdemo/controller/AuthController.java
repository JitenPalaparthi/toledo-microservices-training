package com.spanlet.jwtdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spanlet.jwtdemo.service.AuthService;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Hardcoded validation
        if ("user".equals(username) && "password".equals(password)) {
            return authService.generateToken(username);
        } else {
            return "Invalid credentials";
        }
    }
    
}