package com.example.repositories;
import com.example.entities.Image;
import com.example.services.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public  interface RecruiterRepository extends JpaRepository<Image, Long>{

	@Query("SELECT i FROM Image i JOIN i.album a WHERE a.AlbumName = 'Recruiter'")
	 List<Image> getImageByName();
}


