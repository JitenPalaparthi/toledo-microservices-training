package com.spanlet.serviceconsumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class BackendService {

    private static final String BACKEND_SERVICE = "backendService";
    private final RestTemplate restTemplate;

    public BackendService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(name = BACKEND_SERVICE, fallbackMethod = "fallback")
    public String callBackendService(String id) {
        return restTemplate.getForObject("http://localhost:8081/service/" + id, String.class);
    }

    public String fallback(String id, Exception e) {
        return "Fallback response for id: " + id + ". Reason: " + e.getMessage();
    }
}