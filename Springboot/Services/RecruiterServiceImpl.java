package com.example.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Recruiter;
import com.example.repositories.RecruiterRepository;

import java.util.List;

@Service
public class RecruiterServiceImpl implements RecruiterService {

    @Autowired
    private RecruiterRepository repo;

    public List<Recruiter> getAllLogo() {
        return repo.findAll();
    }
}
