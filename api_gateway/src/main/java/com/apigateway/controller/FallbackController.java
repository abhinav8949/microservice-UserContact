package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallBack(){
        return "User Service is down";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallBack(){
        return "Contact Service is down";
    }
}
