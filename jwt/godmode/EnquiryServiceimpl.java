package com.example.godmode;


import com.example.godmode.Enquiry;
import com.example.godmode.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnquiryServiceimpl implements EnquiryService {

    @Autowired
    private EnquiryRepository enquiryRepository;
    
    @Override
    public Enquiry saveEnquiry(Enquiry enquiry) {
        return enquiryRepository.save(enquiry);
    }
    @Override
    public List<Enquiry> getAllEnquiries() {
        return enquiryRepository.findAll();
    }
    @Override
    public Optional<Enquiry> getEnquiryById(Long id) {
        return enquiryRepository.findById(id);
    }
    @Override
    public void deleteEnquiry(Long id) {
        enquiryRepository.deleteById(id);
    }
}