package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Courses;
import com.example.Service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping(value="/api/course")
	public List<Courses> getActiveCourse(){
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
	
	
}

