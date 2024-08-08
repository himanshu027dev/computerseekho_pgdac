package com.example.godmode;

import java.util.List;
import java.util.Optional;

public interface EnquiryService {
     Enquiry saveEnquiry(Enquiry enquiry);
     List<Enquiry> getAllEnquiries();
     Optional<Enquiry> getEnquiryById(Long id);
     void deleteEnquiry(Long id);
}
