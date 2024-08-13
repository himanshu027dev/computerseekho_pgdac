package com.example.services;

import java.util.List;
import java.util.Optional;
import com.example.entities.Enquiry;

public interface EnquiryService {
     Enquiry saveEnquiry(Enquiry enquiry);
     List<Enquiry> getAllEnquiries();
     Optional<Enquiry> getEnquiryById(Long id);
     void deleteEnquiry(Long id);
}
