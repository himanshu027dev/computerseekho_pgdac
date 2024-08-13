package com.example.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.DTO.ImageStudentDTO;
import com.example.entities.Image;
import com.example.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {



}

