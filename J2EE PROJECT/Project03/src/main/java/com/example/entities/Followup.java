package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "Followup")
public class Followup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "followup_id")
    private Integer followupId;

    @OneToOne
    @JoinColumn(name = "e_id", referencedColumnName = "enquiryId")
    private AdminEnquiry enquiry;

    @ManyToOne
    @JoinColumn(name = "st_id", referencedColumnName = "staffid")
    private Staff staff;

    @Column(name = "followup_date")
    @Temporal(TemporalType.DATE)
    private Date followupDate;

    @Column(name = "followup_msg", length = 150)
    private String followupMsg;

    @Column(name = "is_active")
    private Boolean isActive;

    // Getters and Setters

    public Integer getFollowupId() {
        return followupId;
    }

    public void setFollowupId(Integer followupId) {
        this.followupId = followupId;
    }

    public AdminEnquiry getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(AdminEnquiry enquiry) {
        this.enquiry = enquiry;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Date getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(Date followupDate) {
        this.followupDate = followupDate;
    }

    public String getFollowupMsg() {
        return followupMsg;
    }

    public void setFollowupMsg(String followupMsg) {
        this.followupMsg = followupMsg;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
