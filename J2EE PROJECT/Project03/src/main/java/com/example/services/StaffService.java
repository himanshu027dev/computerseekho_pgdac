package com.example.services;

import java.util.List;
import java.util.Optional;


import com.example.entities.Staff;


public interface StaffService {
	Staff addStaff(Staff staff);
	List<Staff> getStaff();
	void deleteStaffbyId(int staffid);
	 Optional<Staff> getStaffbyId(int staffid);
	 public void updatestaffbyid(int staffid, Staff staff);
	
	

}
