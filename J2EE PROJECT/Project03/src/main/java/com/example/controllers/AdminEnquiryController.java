package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.DTO.*;
import com.example.entities.AdminEnquiry;
import com.example.services.AdminEnquiryService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin("http://localhost:3000")

public class AdminEnquiryController {
	@Autowired
	AdminEnquiryService adminenquiryservice;
	
	@GetMapping(value="/pta/getEn")
	public List<AdminEnquiryDTO> getEnquiry(){
		return adminenquiryservice.getActiveEnquiry();
	}
	
	@PostMapping(value="/pta/Add")
    public ResponseEntity<String> addEnquiry(@RequestBody AdminEnquiry adminEnquiry) {
        try {
        	adminenquiryservice.addingEnquiry(adminEnquiry);
            return ResponseEntity.ok("Enquiry added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error adding enquiry: " + e.getMessage());
        }
	}
	@PutMapping(value="/admin/up/{id}")
	public void updateEnquiry( @PathVariable int id,@RequestBody AdminEnquiry adminenquiry) {
		adminenquiryservice.updateEnquiry(id,adminenquiry);
		
	}
	@DeleteMapping(value="/admin/del/{id}")
	public void deleteEnquiry(@PathVariable int id) {
		adminenquiryservice.deleteEnquiry(id);
	}

}
