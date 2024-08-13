package com.example.DTO;

import java.util.Date;

public class RegistrationDTO {
	
	    // Student details
	    private String studentName;
	    private String studentGender;
	    private String address;
	    private Date dob;
	    private String studentQualification;
	    private long mobileNum;
	    private String studentPhoto;
	    private long alternateNum;

	    // Course and Batch details provided by user
	    private String courseName;
	    private String batchName;

	    // Payment details
	    private String checkorUIDno;
	    private String paymentType;
	    private Date date;
	    private double amount;
	    
	    public String getCheckorUIDno() {
			return checkorUIDno;
		}
		public void setCheckorUIDno(String checkorUIDno) {
			this.checkorUIDno = checkorUIDno;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
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
		public String getStudentPhoto() {
			return studentPhoto;
		}
		public void setStudentPhoto(String studentPhoto) {
			this.studentPhoto = studentPhoto;
		}
		public long getAlternateNum() {
			return alternateNum;
		}
		public void setAlternateNum(long alternateNum) {
			this.alternateNum = alternateNum;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getBatchName() {
			return batchName;
		}
		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}
		public String getPaymentType() {
			return paymentType;
		}
		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}

	    // Getters and Setters
	

}
