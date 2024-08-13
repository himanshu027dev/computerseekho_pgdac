package com.example.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="adminEnquiry")
public class AdminEnquiry {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int enquiryId;
    private String enquirerName;
    private String studentName;
    private String address;
    private long mobile;
    private long alternateMobile;
    private String emailId;
    private Date enquiryDate;
    private String enquirerQuery;
    private boolean isActive;
    @ManyToOne
    @JoinColumn(name="c_id",referencedColumnName="courseId")
    private Courses course;
    @ManyToOne
    @JoinColumn(name="s_id",referencedColumnName="staffid")
    private Staff staff;
    
    
    public int getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getEnquirerName() {
		return enquirerName;
	}
	public void setEnquirerName(String enquirerName) {
		this.enquirerName = enquirerName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(long alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getEnquiryDate() {
		return enquiryDate;
	}
	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}
	public String getEnquirerQuery() {
		return enquirerQuery;
	}
	public void setEnquirerQuery(String enquirerQuery) {
		this.enquirerQuery = enquirerQuery;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Date getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}
	private Date followUpDate;


}
