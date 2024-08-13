package com.example.DTO;


	import java.util.Date;

	public class AdminEnquiryDTO {

	    private int enquiryId;
	    private String studentName;
	    private String enquirerName;
	    private String address;
	    private String emailId;
	    private long alternateMobile;
	    private String enquirerQuery;
	    private Date enquiryDate;
	    private Date followUpDate;
	    private String courseName;
	    private String staffName;
	    private boolean isActive;

	    
	    public AdminEnquiryDTO(int enquiryId, String studentName, String enquirerName, String address, String emailId, long alternateMobile, String enquirerQuery, Date enquiryDate, Date followUpDate, String courseName, String staffName, boolean isActive) {
	        this.enquiryId = enquiryId;
	        this.studentName = studentName;
	        this.enquirerName = enquirerName;
	        this.address = address;
	        this.emailId = emailId;
	        this.alternateMobile = alternateMobile;
	        this.enquirerQuery = enquirerQuery;
	        this.enquiryDate = enquiryDate;
	        this.followUpDate = followUpDate;
	        this.courseName = courseName;
	        this.staffName = staffName;
	        this.isActive = isActive;
	    }

	    // Getters and Setters
	    public int getEnquiryId() {
	        return enquiryId;
	    }

	    public void setEnquiryId(int enquiryId) {
	        this.enquiryId = enquiryId;
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    public void setStudentName(String studentName) {
	        this.studentName = studentName;
	    }

	    public String getEnquirerName() {
	        return enquirerName;
	    }

	    public void setEnquirerName(String enquirerName) {
	        this.enquirerName = enquirerName;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getEmailId() {
	        return emailId;
	    }

	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }

	    public long getAlternateMobile() {
	        return alternateMobile;
	    }

	    public void setAlternateMobile(long alternateMobile) {
	        this.alternateMobile = alternateMobile;
	    }

	    public String getEnquirerQuery() {
	        return enquirerQuery;
	    }

	    public void setEnquirerQuery(String enquirerQuery) {
	        this.enquirerQuery = enquirerQuery;
	    }

	    public Date getEnquiryDate() {
	        return enquiryDate;
	    }

	    public void setEnquiryDate(Date enquiryDate) {
	        this.enquiryDate = enquiryDate;
	    }

	    public Date getFollowUpDate() {
	        return followUpDate;
	    }

	    public void setFollowUpDate(Date followUpDate) {
	        this.followUpDate = followUpDate;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }

	    public String getStaffName() {
	        return staffName;
	    }

	    public void setStaffName(String staffName) {
	        this.staffName = staffName;
	    }

	    public boolean isActive() {
	        return isActive;
	    }

	    public void setActive(boolean isActive) {
	        this.isActive = isActive;
	    }
	}


