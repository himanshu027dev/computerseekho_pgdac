package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Integer>{
	
	
	

}
