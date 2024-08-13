package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import com.example.entities.AdminLogin;
import com.example.model.AdminModel;
import com.example.util.JwtUtil;

@RestController
@RequestMapping("/api")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtUtil jwtUtil;
    private final AdminModel model;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserDetailsService userDetailsService, JwtUtil jwtUtil, AdminModel model) {
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtUtil = jwtUtil;
        this.model = model;
    }

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @PostMapping("/adminLogin")
    public ResponseEntity<String> login(@RequestBody AdminLogin admin) {
        try {
            System.out.println("Attempting to authenticate user: " + admin.getEmail());
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(admin.getEmail(), admin.getPassword()));
            final UserDetails userDetails = userDetailsService.loadUserByUsername(admin.getEmail());
            final String jwt = jwtUtil.generateToken(userDetails.getUsername());
            return ResponseEntity.ok(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @PostMapping("/adminSignup")
    public ResponseEntity<String> addAdmin(@RequestBody AdminLogin admin) {
        model.addAdmin(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body("Admin added successfully");
    }

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @PostMapping("/refreshToken")
    public ResponseEntity<String> refreshToken(@RequestHeader("Authorization") String refreshToken) {
        // Logic to validate and generate a new JWT using the refresh token
        return ResponseEntity.ok("New JWT token");
    }
}
