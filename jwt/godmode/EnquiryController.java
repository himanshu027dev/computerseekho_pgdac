package com.example.godmode;



import com.example.godmode.Enquiry;
import com.example.godmode.EnquiryServiceimpl;
import com.example.godmode.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/enquiries")
@CrossOrigin("http://localhost:3000")
public class EnquiryController {

    @Autowired
    private EnquiryService enquiryService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/addenquiry")
    public ResponseEntity<Enquiry> createEnquiry(@RequestBody Enquiry enquiry) {
        Enquiry savedEnquiry = enquiryService.saveEnquiry(enquiry);
        
        String sendEnquiry = emailService.enquiryEmail(enquiry);

        System.out.println(sendEnquiry);
        return ResponseEntity.ok(savedEnquiry);
    }

    @GetMapping("/getallenquiry")
    public ResponseEntity<List<Enquiry>> getAllEnquiries() {
        List<Enquiry> enquiries = enquiryService.getAllEnquiries();
        return ResponseEntity.ok(enquiries);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enquiry> getEnquiryById(@PathVariable Long id) {
        Optional<Enquiry> enquiry = enquiryService.getEnquiryById(id);
        return enquiry.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnquiry(@PathVariable Long id) {
        enquiryService.deleteEnquiry(id);
        return ResponseEntity.noContent().build();
    }
}

