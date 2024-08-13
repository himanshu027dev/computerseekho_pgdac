package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.AdminEnquiry;
import com.example.DTO.*;
@Repository
public interface AdminEnquiryRepository extends JpaRepository<AdminEnquiry, Integer> {
	
	//@Query(value="select enquiry_id,student_name,enquirer_name,enquirer_query,enquiry_date,follow_up_date,course_name,staffname,is_active from enquiry e join courses c on e.c_id on c.course_id join staff_master s on s.staffid=e.e_id where is_active=true",nativeQuery=true)
//	@Query(value = "SELECT e.enquiry_id, e.student_name, e.enquirer_name,e. address, e.email_id,e.alternate_mobile, e.enquirer_query, e.enquiry_date, e.follow_up_date, c.course_name, s.staffname, e.is_active from enquiry e join courses c on e.c_id=c.course_id join staff_master s on s.staffid=e.s_id where e.is_active=true", 
//       nativeQuery = true)
	@Query("SELECT new com.example.DTO.AdminEnquiryDTO(e.enquiryId, e.studentName, e.enquirerName, e.address, " +
	           "e.emailId, e.alternateMobile, e.enquirerQuery, e.enquiryDate, e.followUpDate, c.courseName, " +
	           "s.staffname, e.isActive) " +
	           "FROM AdminEnquiry e " +
	           "JOIN e.course c " +
	           "JOIN e.staff s " +
	           "WHERE e.isActive = true")
	    List<AdminEnquiryDTO> getActiveReco();
	

}
