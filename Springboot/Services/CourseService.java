package com.example.Service;

import java.util.List;

import com.example.Entity.Courses;

public interface CourseService {
	
	public String getCourseDiscription(String course_name);
	public String getSyllabus(String Course_name);
	public List<Courses> getActive();
}
