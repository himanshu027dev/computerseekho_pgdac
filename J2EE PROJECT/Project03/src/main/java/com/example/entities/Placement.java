package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

	
	@Entity
	@Table(name = "Placement_master")
	public class Placement {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int placementId;

	    @ManyToOne
	    @JoinColumn(name = "s_id", referencedColumnName = "studentId")
	    private Student student;

	    @ManyToOne
	    @JoinColumn(name = "c_id", referencedColumnName = "courseId")
	    private Courses course;

	    @ManyToOne
	    @JoinColumn(name = "b_id", referencedColumnName = "batchId")
	    private Batch batch;
	    private String duration;
	    private String companyName;

		public int getPlacementId() {
			return placementId;
		}

		public void setPlacementId(int placementId) {
			this.placementId = placementId;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
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

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

	    // Getters and setters
	}

  

