package com.example.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Announcement {

    private int announcementId;
    private String announcementText;
    private Date announcementDate;
    private boolean isActive;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAnnouncementId() {
		return announcementId;
	}
	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
	}
	public String getAnnouncementText() {
		return announcementText;
	}
	public void setAnnouncementText(String announcementText) {
		this.announcementText = announcementText;
	}
	public Date getAnnouncementDate() {
		return announcementDate;
	}
	public void setAnnouncementDate(Date announcementDate) {
		this.announcementDate = announcementDate;
	}
	 public boolean getIsActive() {  // Corrected getter
	        return isActive;
	    }

	    public void setIsActive(boolean isActive) {  // Corrected setter
	        this.isActive = isActive;
	    }

    

   

    
}
