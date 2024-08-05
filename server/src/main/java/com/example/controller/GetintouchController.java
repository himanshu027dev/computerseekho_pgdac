package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entities.*;
import com.example.services.servicesimpl;;


@RestController  
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from this origin
public class GetintouchController {
    
    @Autowired
    private servicesimpl getintouchService;

    @PostMapping("/getintouch") // Corrected endpoint path
    public void addpro(@RequestBody Getintouch genq) {
        System.out.println("addpro called");
        getintouchService.addenqirycon(genq);
    }
}
