package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Staff;
import com.example.services.StaffService;



@RestController
@RequestMapping("/api")
@CrossOrigin
public class StaffController {
@Autowired 
private StaffService service ;

@PostMapping("/pta/addstaff")
public void addstaffmember(@RequestBody Staff staff) {
	service.addStaff(staff);
}
@GetMapping("/pta/getstaff")
public List<Staff> getallstaff(){
	return service.getStaff();
}
@PutMapping("/admin/updatestaff/{staffid}")
public void updatestaff(@PathVariable Integer staffid, @RequestBody Staff staff) {
    service.updatestaffbyid(staffid, staff);
}


public static class StaffIdRequest {
    private Integer staffid;

    // Getter and Setter
    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }
}
@GetMapping("/pta/getStaffbyId")
public Staff getstaffwithid(@RequestBody StaffIdRequest request) {
    Optional<Staff> staff = service.getStaffbyId(request.getStaffid());
    return staff.orElse(null); // Handle the case where staff is not found
}


//@GetMapping("/pta/getStaffbyId")
//public Staff getstaffwithid(@RequestBody Integer staffid) {
//	Optional<Staff> staff= service.getStaffbyId(staffid);
//	return staff.get();
//}

@DeleteMapping("/admin/deletestaff")
public void deletewithid(@RequestBody StaffIdRequest request)
{
	service.deleteStaffbyId(request.getStaffid());
}

}
