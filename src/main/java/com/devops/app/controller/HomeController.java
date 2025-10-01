package com.devops.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${app.message}")
    private String message;

    @Value("${app.description}")
    private String description;

    @RequestMapping("/")
    public ResponseEntity<Map<String, String>> home() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", message);
        response.put("description", description);
        return ResponseEntity.ok(response);
    }
}
