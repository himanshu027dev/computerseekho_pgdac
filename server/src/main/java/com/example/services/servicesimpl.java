package com.example.services;

import com.example.entities.Getintouch;
import com.example.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesimpl implements Iservices {
    
    @Autowired
    GetintouchRepository repository;

    @Override
	public void addenqirycon(Getintouch p) {
		repository.save(p);
		
		
	}
    
}
