package com.example.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_master")
public class Student {

	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private int studentId;

	     private String studentName;

	     private String studentGender;
	     private String Address;


	     private Date dob;

	     private String studentQualification;

	     private long mobileNum;
	     
	     private String studentPhoto;
	     private long alternate_num;

	     @ManyToOne
	     @JoinColumn(name = "c_id", referencedColumnName = "courseId")
	     private Courses course;

	     @ManyToOne
	     @JoinColumn(name = "b_id", referencedColumnName = "batchId")
	     private Batch batch;

		
	     
	     //-------------------------------
	     @OneToMany(mappedBy = "student") 
	     private List<Placement> placements;
	     
	     
	     public List<Placement> getPlacements() {
			return placements;
		}

		public void setPlacements(List<Placement> placements) {
			this.placements = placements;
		}

		//-------------------------------
	     public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getStudentGender() {
			return studentGender;
		}

		public void setStudentGender(String studentGender) {
			this.studentGender = studentGender;
		}
		
		public String getAdress() {
			return Address;
		}

		public void setAddress(String Address) {
			this.Address = Address;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getStudentQualification() {
			return studentQualification;
		}

		public void setStudentQualification(String studentQualification) {
			this.studentQualification = studentQualification;
		}

		public long getMobileNum() {
			return mobileNum;
		}

		public void setMobileNum(long mobileNum) {
			this.mobileNum = mobileNum;
		}

		public Courses getCourse() {
			return course;
		}

		public void setCourse(Courses course) {
			this.course = course;
		}

		public Batch getBatch() {
			return batch;
		}

		public void setBatch(Batch batch) {
			this.batch = batch;
		}

		public String getStudent_photo() {
			return studentPhoto;
		}

		public void setStudent_photo(String student_photo) {
			studentPhoto = student_photo;
		}

		public long getAlternate_num() {
			return alternate_num;
		}

		public void setAlternate_num(long alternate_num) {
			this.alternate_num = alternate_num;
		}

	
	
}

 