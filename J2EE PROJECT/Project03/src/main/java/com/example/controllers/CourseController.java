package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Courses;
import com.example.services.CourseService;

@RestController

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping(value="/api/course")
	public List<String> getActiveCourse(){
		return courseService.getActive();
	}
	@GetMapping(value="/api/course/{course_name}")
	public String getCourse(@PathVariable String course_name) {
		return courseService.getCourseDiscription(course_name);
	}
	@GetMapping(value="/api/course/course_name/{syllabus}")
	public String getSyllabus(@PathVariable String course_name) {
		return courseService.getSyllabus(course_name);
	}
	@GetMapping(value="/api/pta/getallcourse/course")
	public List<Courses>getCourses(){
		return courseService.getCourses();
	}
	@PostMapping(value="/api/admin/course")
	public void AddDetails(@RequestBody Courses course) {
		courseService.addCourse(course);
		System.out.print("Added successfully");
	}
	@PutMapping(value="/api/admin/course/{id}")
    public void updateCourse(@RequestBody Courses course, @PathVariable int id) {
        courseService.updateCourse(course, id);
    }
	@DeleteMapping(value="/api/admin/course/{id}")
	public void removecourse(@PathVariable int id) {
		courseService.softDeleteCourse(id);
	}
	
	@GetMapping(value="/api/admin/course/{id}")
	public Optional<Courses> getbyid(@PathVariable int id) {
		return courseService.getId(id);
	}

}


//
//
//package com.example.controllers;
//
//import java.util.List;
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
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.entities.Courses;
//import com.example.services.CourseService;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
//@RequestMapping("/api")
//public class CourseController {
//	@Autowired
//	CourseService courseService;
//	
//
//	@GetMapping(value="/pta/course")
//	public List<String> getActiveCourse(){
//		return courseService.getActive();
//	}
//	@GetMapping(value="/pta/course/{course_name}")
//	public String getCourse(@PathVariable String course_name) {
//		return courseService.getCourseDiscription(course_name);
//	}
//	@GetMapping(value="/pta/course_name/{syllabus}")
//	public String getSyllabus(@PathVariable String course_name) {
//		return courseService.getSyllabus(course_name);
//	}
//	@GetMapping(value="/pta/getallcourse/course")
//	public List<Courses>getCourses(){
//		
//		return courseService.getCourses();
//	}
//	@PostMapping(value="/pta/addcourse/course")
//	public void AddDetails(@RequestBody Courses course) {
//		courseService.addCourse(course);
//		System.out.print("Added successfully");  
//	}
//	
//	@PutMapping(value="/pta/updatecourse/course/{id}")
//    public void updateCourse(@RequestBody Courses course, @PathVariable int id) {
//        courseService.updateCourse(course, id);
//    }
//	@GetMapping(value="/pta/course/{id}")
//	public Optional<Courses> getbyid(@PathVariable int id) {
//		return courseService.getId(id);
//	}
//	@DeleteMapping(value="/admin/course/{id}")
//	public void removecourse(@PathVariable int id) {
//		courseService.softDeleteCourse(id);
//	} 
//
//}


