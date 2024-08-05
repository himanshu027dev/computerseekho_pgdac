package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {

	private int Course_id;
	private String Course_name;
	private String Course_Discription;
	private int Course_duration;
	private String Course_syllabus;
	private boolean Course_isactive;
	private String Cover_photo;
	private int Video_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public String getCourse_Discription() {
		return Course_Discription;
	}
	public void setCourse_Discription(String course_Discription) {
		Course_Discription = course_Discription;
	}
	public int getCourse_duration() {
		return Course_duration;
	}
	public void setCourse_duration(int course_duration) {
		Course_duration = course_duration;
	}
	public String getCourse_syllabus() {
		return Course_syllabus;
	}
	public void setCourse_syllabus(String course_syllabus) {
		Course_syllabus = course_syllabus;
	}
	public boolean isCourse_isactive() {
		return Course_isactive;
	}
	public void setCourse_isactive(boolean course_isactive) {
		Course_isactive = course_isactive;
	}
	public String getCover_photo() {
		return Cover_photo;
	}
	public void setCover_photo(String cover_photo) {
		Cover_photo = cover_photo;
	}
	public int getVideo_id() {
		return Video_id;
	}
	public void setVideo_id(int video_id) {
		Video_id = video_id;
	}
}
