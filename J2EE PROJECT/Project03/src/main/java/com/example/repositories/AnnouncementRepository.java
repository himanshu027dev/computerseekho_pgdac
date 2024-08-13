package com.example.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.entities.*;

import jakarta.transaction.Transactional;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {

@Query(value="SELECT announcement_text FROM Announcement where is_active=true",nativeQuery=true)
 	public String getAnnoucement();



}


