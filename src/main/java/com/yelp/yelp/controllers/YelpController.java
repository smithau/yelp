package com.yelp.yelp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/YelpController")
public class YelpController {
    
    @GetMapping("/get")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("HELLO WORLD");
    }
}
