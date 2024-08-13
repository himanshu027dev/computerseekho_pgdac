package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Student;
import com.example.repositories.*;

import java.util.List;


    
    @Service
    public class StudentServiceImpl implements StudentService {
    	
        @Autowired
        private StudentRepository repo;
    
        @Override
        public void addstudent(Student student) {
        	repo.save(student);
        }

	

    }


