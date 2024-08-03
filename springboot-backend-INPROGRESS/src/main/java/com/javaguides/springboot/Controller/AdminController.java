//package com.javaguides.springboot.Controller;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.javaguides.springboot.Entities.AdminLogin;
//import com.javaguides.springboot.Model.AdminModel;
//
//
//@RestController  
//@CrossOrigin("http://127.0.0.1:5500")
//public class AdminController 
//{
//	@Autowired
//	AdminModel model;
//	
//	 @GetMapping(value = "api/admin_id/{adminId}")
//	 public Optional<AdminLogin> getPro(@PathVariable int adminId)
//	 {
//		Optional<AdminLogin> ad=model.getAdmin(adminId);
//		return ad;
//	 }
//
//	@PostMapping(value = "api/admin")
//	 public void addAdmin(@RequestBody AdminLogin admin)
//	 {
//		System.out.println("addAdmin called");
//		model.addAdmin(admin);
//	 }
//	
//}

package com.javaguides.springboot.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.springboot.Entities.AdminLogin;
import com.javaguides.springboot.Model.AdminModel;

@RestController  
@CrossOrigin("http://127.0.0.1:5500")
public class AdminController 
{
    @Autowired
    private AdminModel model;

    @GetMapping(value = "api/admin_id/{name}")
    public ResponseEntity<AdminLogin> getAdmin(@PathVariable String name) 
    {
        Optional<AdminLogin> admin = model.getAdmin(name);
        return admin.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping(value = "api/admin")
    public ResponseEntity<String> addAdmin(@RequestBody AdminLogin admin) 
    {
        model.addAdmin(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body("Admin added successfully");
    }

    // Optionally, you might want to include other methods like PUT, DELETE, etc.
}

