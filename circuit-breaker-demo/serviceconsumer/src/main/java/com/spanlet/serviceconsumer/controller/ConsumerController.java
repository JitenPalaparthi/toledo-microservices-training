package com.spanlet.serviceconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spanlet.serviceconsumer.service.BackendService;

@RestController
public class ConsumerController {

    private final BackendService backendService;

    public ConsumerController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/consume/{id}")
    public String consumeService(@PathVariable String id) {
        return backendService.callBackendService(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
}