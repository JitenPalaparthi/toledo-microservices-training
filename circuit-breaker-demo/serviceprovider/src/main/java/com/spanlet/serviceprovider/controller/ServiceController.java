package com.spanlet.serviceprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/service/{id}")
    public String getService(@PathVariable String id) {
        // Simulate occasional failure
        if (id.equals("fail")) {
            throw new RuntimeException("Service failed");
        }
        return "Response from service for id: " + id;
    }
}