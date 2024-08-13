package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Staff;
import com.example.repositories.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	StaffRepository stfrepository;
	
	@Override
	public Staff addStaff(Staff staff) {
		return stfrepository.save(staff);
	}
	
	public List<Staff> getStaff(){
		
		return stfrepository.findAll();
	}
	
	public Optional<Staff> getStaffbyId(int staffid) {
		return stfrepository.findById(staffid);
	}
	
	public void deleteStaffbyId(int  staffid)
	{
		stfrepository.deleteById(staffid);
	}
	
	public void updatestaffbyid(int staffid, Staff staff) {
        Optional<Staff> staffOptional = stfrepository.findById(staffid);
        if (staffOptional.isPresent()) {
            Staff existingStaff = staffOptional.get();
            existingStaff.setStaffname(staff.getStaffname());
            existingStaff.setStaffmobile(staff.getStaffmobile());
            existingStaff.setStaffemail(staff.getStaffemail());
            existingStaff.setStaffrole(staff.getStaffrole());
            stfrepository.save(existingStaff);
        }else {
        	System.out.println("faild to update");
        }
        	
    }
	
}
