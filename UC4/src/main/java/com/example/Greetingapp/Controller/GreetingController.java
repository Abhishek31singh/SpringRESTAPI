package com.example.Greetingapp.Controller;

import com.example.Greetingapp.GreetingService;
import com.example.Greetingapp.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
//==========================UC4=====================================//
    // Endpoint to save greeting message
    @PostMapping("/add")
    public ResponseEntity<Greeting> saveGreeting(@RequestBody String message) {
        Greeting savedGreeting = greetingService.saveGreeting(message);
        return ResponseEntity.ok(savedGreeting);
    }
}
