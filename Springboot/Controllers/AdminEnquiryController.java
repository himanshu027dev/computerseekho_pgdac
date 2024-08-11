/*package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Entities.AdminEnquiry;
import com.example.Service.AdminEnquiryService;
import com.example.dto.AdminEnquiryDTO;

@RestController
@RequestMapping(value="/api/AdminEnquiry")
public class AdminEnquiryController {
	@Autowired
	AdminEnquiryService adminenquiryservice;
	
	@GetMapping
	public List<AdminEnquiryDTO> getEnquiry(){
		return adminenquiryservice.getActiveEnquiry();
	}
	
	@PostMapping(value="/Add")
    public ResponseEntity<String> addEnquiry(@RequestBody AdminEnquiry adminEnquiry) {
        try {
        	adminenquiryservice.addingEnquiry(adminEnquiry);
            return ResponseEntity.ok("Enquiry added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error adding enquiry: " + e.getMessage());
        }
	}
	@PutMapping(value="/up/{id}")
	public void updateEnquiry( @PathVariable int id,@RequestBody AdminEnquiry adminenquiry) {
		adminenquiryservice.updateEnquiry(id,adminenquiry);
		
	}
	@DeleteMapping(value="/del/{id}")
	public void deleteEnquiry(@PathVariable int id) {
		adminenquiryservice.deleteEnquiry(id);
	}

}
*/
