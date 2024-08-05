package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Courses;
import com.example.Repositories.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService 
{
	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public String getCourseDiscription(String course_name) {
		
		return courseRepository.getDiscription(course_name);
		
	}
	
	@Override
	public String getSyllabus(String Course_name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Courses> getActive() {
		return courseRepository.getActiveCourse(); 
	}

}
