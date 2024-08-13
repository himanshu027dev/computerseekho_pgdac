package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Courses;

public interface CourseService {
	
	public String getCourseDiscription(String course_name);
	public String getSyllabus(String Course_name);
	public List<String> getActive();
	public List<Courses>getCourses();
	public void addCourse(Courses course);
	public void updateCourse(Courses course, int id);
	public void softDeleteCourse(int id);
	public Optional<Courses> getId(int id);

}
