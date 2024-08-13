package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DTO.ImageStudentDTO;
import com.example.entities.Student;
import com.example.services.StudentService;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/register")
    public void postregistration(@RequestBody  Student student) {
         service.addstudent(student);
         System.out.println("Registered successfully");
    }
}
