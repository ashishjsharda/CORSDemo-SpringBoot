package com.example.corsdemo2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

        @RequestMapping("/hello")
        public String hello() {
            return "Hello from Controller!";
        }

        @PostMapping("/greet")
        public String greetUser(@RequestBody String name) {
            return "Hello " + name + "!";
        }

        @GetMapping("/public-data")
        public String getPublicData() {
            return "This is public data!";
        }

        @GetMapping("/restricted-data")
        public String privateData() {
            return "This is restricted data!";
        }

}
