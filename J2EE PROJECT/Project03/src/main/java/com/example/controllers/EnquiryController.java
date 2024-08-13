package com.example.controllers;



import com.example.entities.Enquiry;
//import com.example.services.EnquiryServiceimpl;
import com.example.services.EmailService;
import com.example.services.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EnquiryController {

    @Autowired
    private EnquiryService enquiryService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/admin/enquiries/addenquiry")
    public ResponseEntity<Enquiry> createEnquiry(@RequestBody Enquiry enquiry) {
        Enquiry savedEnquiry = enquiryService.saveEnquiry(enquiry);
        
        String sendEnquiry = emailService.enquiryEmail(enquiry);

        System.out.println(sendEnquiry);
        return ResponseEntity.ok(savedEnquiry);
    }

    @GetMapping("/pta/enquiries/getallenquiry")
    public ResponseEntity<List<Enquiry>> getAllEnquiries() {
        List<Enquiry> enquiries = enquiryService.getAllEnquiries();
        return ResponseEntity.ok(enquiries);
    }

    @GetMapping("/pta/enquiries/{id}")
    public ResponseEntity<Enquiry> getEnquiryById(@PathVariable Long id) {
        Optional<Enquiry> enquiry = enquiryService.getEnquiryById(id);
        return enquiry.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/admin/enquiries/{id}")
    public ResponseEntity<Void> deleteEnquiry(@PathVariable Long id) {
        enquiryService.deleteEnquiry(id);
        return ResponseEntity.noContent().build();
    }
}

