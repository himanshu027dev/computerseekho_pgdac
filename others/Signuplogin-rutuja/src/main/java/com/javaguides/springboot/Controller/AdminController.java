package com.javaguides.springboot.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.springboot.Entities.AdminLogin;
import com.javaguides.springboot.Model.AdminModel;

@RestController
@RequestMapping("/api")

public class AdminController 
{
    @Autowired
    private AdminModel model;

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") 
    @PostMapping(value = "/adminLogin")
    public ResponseEntity<Optional<AdminLogin>> login(@RequestBody AdminLogin admin) {
        Optional<AdminLogin> foundUser = model.getAdmin(admin);
        if (foundUser != null && foundUser.get().getPassword().equals(admin.getPassword())) {
            return ResponseEntity.ok(foundUser);
        }
        return ResponseEntity.status(401).build(); // Unauthorized
    }
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") 
    @PostMapping(value = "/adminSignup")
    public ResponseEntity<String> addAdmin(@RequestBody AdminLogin admin) 
    {
        model.addAdmin(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body("Admin added successfully");
    }

    // Optionally, you might want to include other methods like PUT, DELETE, etc.
}