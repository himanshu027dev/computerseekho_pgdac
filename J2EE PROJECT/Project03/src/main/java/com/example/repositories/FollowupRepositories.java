package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Followup;

public interface FollowupRepositories extends JpaRepository<Followup, Integer> {

	
}
