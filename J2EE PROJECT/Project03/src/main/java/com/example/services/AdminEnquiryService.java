package com.example.services;

import java.util.List;

import com.example.entities.AdminEnquiry;
import com.example.DTO.*;

public interface AdminEnquiryService {
	public List<AdminEnquiryDTO>getActiveEnquiry();
	public void addingEnquiry(AdminEnquiry adminenquiry);
	 void updateEnquiry(int enquiryId, AdminEnquiry adminEnquiry);
	 void deleteEnquiry(int id);
}
