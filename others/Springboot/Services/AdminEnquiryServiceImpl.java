/*package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.AdminEnquiryDTO;
import com.example.Entities.AdminEnquiry;
import com.example.Entities.Courses;
import com.example.Entities.Staff;
import com.example.Repositories.AdminEnquiryRepository;
import com.example.Repositories.CourseRepository;
import com.example.Repositories.StaffRepository;


@Service
public class AdminEnquiryServiceImpl implements AdminEnquiryService
{
	 @Autowired
	 AdminEnquiryRepository adminenquiryrepo;
	
	 @Autowired
	 CourseRepository courseRepository;

	 @Autowired
	 StaffRepository stfrepository;
	 

	@Override
	public List<AdminEnquiryDTO> getActiveEnquiry() {
		
		return adminenquiryrepo.getActiveReco();
	}

	@Override
	public void addingEnquiry(AdminEnquiry adminenquiry) {
		
		try {
			  
			Courses course = courseRepository.findById(adminenquiry.getCourse().getCourseId())
			         .orElseThrow(() -> new RuntimeException("Invalid course ID"));
			Staff staff = stfrepository.findById(adminenquiry.getStaff().getStaffid())
		            .orElseThrow(() -> new RuntimeException("Invalid staff ID"));
			
			// Set the course and staff in AdminEnquiry
			adminenquiry.setCourse(course);
			adminenquiry.setStaff(staff);

			// Save the AdminEnquiry entity
			adminenquiryrepo.save(adminenquiry);
		} catch (RuntimeException e) {
			
			e.printStackTrace();
		}



}

	@Override
	public void updateEnquiry(int enquiryId, AdminEnquiry adminEnquiry) {
	        AdminEnquiry existingEnquiry = adminenquiryrepo.findById(enquiryId)
	            .orElseThrow(() -> new RuntimeException("Enquiry not found with id " + enquiryId));

	        // Update fields
	        existingEnquiry.setEnquirerName(adminEnquiry.getEnquirerName());
	        existingEnquiry.setStudentName(adminEnquiry.getStudentName());
	        existingEnquiry.setAddress(adminEnquiry.getAddress());
	        existingEnquiry.setMobile(adminEnquiry.getMobile());
	        existingEnquiry.setAlternateMobile(adminEnquiry.getAlternateMobile());
	        existingEnquiry.setEmailId(adminEnquiry.getEmailId());
	        existingEnquiry.setEnquiryDate(adminEnquiry.getEnquiryDate());
	        existingEnquiry.setEnquirerQuery(adminEnquiry.getEnquirerQuery());
	        existingEnquiry.setFollowUpDate(adminEnquiry.getFollowUpDate());
	        existingEnquiry.setActive(adminEnquiry.getIsActive());

	        Courses course = courseRepository.findById(adminEnquiry.getCourse().getCourseId())
	            .orElseThrow(() -> new RuntimeException("Invalid course ID"));
	        Staff staff = stfrepository.findById(adminEnquiry.getStaff().getStaffid())
	            .orElseThrow(() -> new RuntimeException("Invalid staff ID"));

	        existingEnquiry.setCourse(course);
	        existingEnquiry.setStaff(staff);

	        adminenquiryrepo.save(existingEnquiry);
	    }

	@Override
	public void deleteEnquiry(int id) {
		adminenquiryrepo.deleteById(id);
		
	}
		
	}
	*/	
	
	
	
	
	
