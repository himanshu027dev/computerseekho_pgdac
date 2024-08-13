package com.example.DTO;


public class ImageStudentDTO {
    private int studentId;
    private String studentName;
    private String studentPhoto;
    private String companyName;

    // Constructor
    public ImageStudentDTO(int studentId, String studentName, String studentPhoto, String companyName) {
        this.studentName = studentName;
        this.studentPhoto = studentPhoto;
        this.companyName = companyName;
        this.studentId = studentId;
    }

    
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

	public String getStudentPhoto() {
		return studentPhoto;
	}

	public void setStudentPhoto(String studentPhoto) {
		this.studentPhoto = studentPhoto;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


}