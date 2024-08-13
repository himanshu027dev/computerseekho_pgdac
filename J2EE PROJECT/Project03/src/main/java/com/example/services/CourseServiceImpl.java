package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Courses;
import com.example.repositories.CourseRepository;
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
	public List<String> getActive() {
		return courseRepository.getActiveCourse(); 
	}

	@Override
	public List<Courses> getCourses() {
		return courseRepository.findAll();
	}

	@Override
	public void addCourse(Courses course) {
		courseRepository.save(course);
		
	}
	 @Override
	    public void updateCourse(Courses course, int id) {
	        courseRepository.updateCourseDetails(
	            course.getCourseDescription(),
	            course.getCourseDuration(),
	            course.isCourseIsActive(),
	            course.getCourseName(),
	            course.getCourseSyllabus(),
	            course.getCoverPhoto(),
	            course.getVideoId(),
	            id
	        );
	 }
	
	@Override
	 public void softDeleteCourse(int id) {
	        courseRepository.deleteById(id);
	    }
	
	@Override
	public Optional<Courses> getId(int id) {
		return courseRepository.findById(id);
	}
}
