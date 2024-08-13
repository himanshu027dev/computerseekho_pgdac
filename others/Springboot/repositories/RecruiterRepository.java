package com.example.repositories;
import com.example.entities.Recruiter;
import com.example.services.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public  interface RecruiterRepository extends JpaRepository<Recruiter, Long>{

}


