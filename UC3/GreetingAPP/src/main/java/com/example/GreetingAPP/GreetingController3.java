package com.example.GreetingAPP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController3 {
    @GetMapping("greets")
    public String greet(@RequestParam(value = "firstName", required = false) String firstName,
                        @RequestParam(value = "lastName", required = false) String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName + "!";
        }
        if (firstName != null) {
            return "Hello, " + firstName + "!";
        }
        if (lastName != null) {
            return "Hello, " + lastName + "!";
        }
        if (firstName != null && !firstName.trim().isEmpty() && lastName != null && !lastName.trim().isEmpty()) {
            return "Hello, " + firstName + " " + lastName + "!";
        }
        return "Hello, World!";


    }
}
