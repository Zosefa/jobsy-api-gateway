package com.gateway.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/gateway-test")
    public String test() {
        return "API Gateway is working!";
    }
}
