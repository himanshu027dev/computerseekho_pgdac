package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Album;

import com.example.entities.Image;
import com.example.services.RecruiterService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecruiterController {

    @Autowired
    private RecruiterService Service;

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @GetMapping("/logos")
    public List<Image> getAllLogos() {
        return Service.getAllLogo();
    }
    
    
//    @GetMapping(value="/api/admin/course")
//	public List<Courses>getCourses(){
//		return courseService.getCourses();
//	}
//	@PostMapping(value="/api/admin/course")
//	public void AddDetails(@RequestBody Courses course) {
//		courseService.addCourse(course);
//		System.out.print("Added successfully");
//	}
//	@PutMapping(value="/api/admin/course/{id}")
//    public void updateCourse(@RequestBody Courses course, @PathVariable int id) {
//        courseService.updateCourse(course, id);
//    }
//	@DeleteMapping(value="/api/admin/course/{id}")
//	public void removecourse(@PathVariable int id) {
//		courseService.softDeleteCourse(id);
//	}
}

