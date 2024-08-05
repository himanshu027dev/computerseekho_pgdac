package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="getintouch")
public class Getintouch {
    
    public Getintouch(){
        super();
    }

    private int enqid;
	private String enqname;
	private String course;
	private String equiry;

    

    public Getintouch(int enqid, String enqname, String course, String equiry) {
        this.enqid = enqid;
        this.enqname = enqname;
        this.course = course;
        this.equiry = equiry;
    }
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getEnqid() {
        return enqid;
    }
    public void setEnqid(int enqid) {
        this.enqid = enqid;
    }
    public String getEnqname() {
        return enqname;
    }
    public void setEnqname(String enqname) {
        this.enqname = enqname;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getEquiry() {
        return equiry;
    }
    public void setEquiry(String equiry) {
        this.equiry = equiry;
    }
    
	
    @Override
    public String toString() {
        return "Getintouch [enqid=" + enqid + ", enqname=" + enqname + ", course=" + course + ", equiry=" + equiry
                + "]";
    }
    //http://localhost:8080/api/getintouch post

}
 