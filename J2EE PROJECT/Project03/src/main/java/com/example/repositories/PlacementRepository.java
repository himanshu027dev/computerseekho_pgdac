package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.DTO.ImageStudentDTO;
import com.example.entities.Image;
import com.example.entities.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Image, Long> {
	
	
	@Query("SELECT new com.example.DTO.ImageStudentDTO(s.studentId, s.studentName, s.studentPhoto, p.companyName) " +
		       "FROM Student s JOIN s.placements p JOIN p.batch b WHERE b.batchName = :batchName")
		List<ImageStudentDTO> findStudentsWithPlacementDetails(@Param("batchName") String batchName);


}
