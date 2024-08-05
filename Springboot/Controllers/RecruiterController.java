package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Recruiter;
import com.example.services.RecruiterService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecruiterController {

    @Autowired
    private RecruiterService Service;

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @GetMapping("/logos")
    public List<Recruiter> getAllLogos() {
        return Service.getAllLogo();
    }
}

