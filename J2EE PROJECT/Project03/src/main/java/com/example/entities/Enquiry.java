package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


import java.io.Serializable;

@Entity
@Table(name = "enquiries")
public class Enquiry implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Manual handling, avoid if not using this
    @Column(name = "enq_id")
    private Long enqId;

    @Column(name = "enq_name", nullable = false)
    private String enqName;

    @Column(name = "course", nullable = false)
    private String course;

    @Column(name = "enquiry", nullable = false)
    private String enquiry;

    @Column(name = "enq_email", nullable = false)
    private String enqEmail;

    @Column(name = "enq_phone", nullable = false)
    private String enqPhone;

    @Column(name = "enq_phone_alt")
    private String enqPhoneAlt;

   

    public Enquiry(){}

    public Enquiry(Long enqId, String enqName, String course, String enquiry, String enqEmail, String enqPhone,
            String enqPhoneAlt) {
        this.enqId = enqId;
        this.enqName = enqName;
        this.course = course;
        this.enquiry = enquiry;
        this.enqEmail = enqEmail;
        this.enqPhone = enqPhone;
        this.enqPhoneAlt = enqPhoneAlt;
    }

    public Long getEnqId() {
        return enqId;
    }

    public void setEnqId(Long enqId) {
        this.enqId = enqId;
    }

    public String getEnqName() {
        return enqName;
    }

    public void setEnqName(String enqName) {
        this.enqName = enqName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }

    public String getEnqEmail() {
        return enqEmail;
    }

    public void setEnqEmail(String enqEmail) {
        this.enqEmail = enqEmail;
    }

    public String getEnqPhone() {
        return enqPhone;
    }

    public void setEnqPhone(String enqPhone) {
        this.enqPhone = enqPhone;
    }

    public String getEnqPhoneAlt() {
        return enqPhoneAlt;
    }

    public void setEnqPhoneAlt(String enqPhoneAlt) {
        this.enqPhoneAlt = enqPhoneAlt;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Enquiry [enqId=" + enqId + ", enqName=" + enqName + ", course=" + course + ", enquiry=" + enquiry
                + ", enqEmail=" + enqEmail + ", enqPhone=" + enqPhone + ", enqPhoneAlt=" + enqPhoneAlt + "]";
    }
}
