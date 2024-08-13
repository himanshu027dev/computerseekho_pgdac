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
import com.example.entities.*;

@Entity
@Table(name = "Batch_master")
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int batchId;

    private String batchName;

    private Date batchStartDate;

    private Date batchEndTime;

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "courseId")
    private Courses course;

    private int courseFees;
    //----------------
    @OneToMany(mappedBy = "batch")
    private List<Placement> placements;
    
    public List<Placement> getPlacements() {
        return placements;
    }

    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }
    
    @OneToMany(mappedBy = "batch") 
    private List<Student> students;
    
    
public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	//---------------------------------------------------------------
    public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Date getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(Date batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public Date getBatchEndTime() {
		return batchEndTime;
	}

	public void setBatchEndTime(Date batchEndTime) {
		this.batchEndTime = batchEndTime;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	public boolean isBatchIsActive() {
		return batchIsActive;
	}

	public void setBatchIsActive(boolean batchIsActive) {
		this.batchIsActive = batchIsActive;
	}

	@Column(name = "batch_is_active")
    private boolean batchIsActive;

    // Getters and setters

    
    
       
}
