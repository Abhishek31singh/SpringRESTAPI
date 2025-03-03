package com.example.GreetingAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class GreetingController2 {
    @Autowired
    private GreetingService greetingService;
    @GetMapping("greet")
    public String getGreeting(){
        return greetingService.getGreetingMessage();
    }
}
