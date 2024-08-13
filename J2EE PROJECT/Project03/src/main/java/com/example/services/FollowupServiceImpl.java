package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.repositories.FollowupRepositories;
import com.example.entities.Followup;


@Service
public class FollowupServiceImpl implements FollowupService{
	
	
	private FollowupRepositories followupRepositories;
	
	 public List<Followup> getAllFollowups() {
	        return followupRepositories.findAll();
	    }

	    public Optional<Followup> getFollowupById(Integer id) {
	        return followupRepositories.findById(id);
	    }

	    public Followup createFollowup(Followup followup) {
	        return followupRepositories.save(followup);
	    }

	    public Followup updateFollowup(Integer id, Followup followup) {
	        if (followupRepositories.findById(id) != null) {
	            followup.setFollowupId(id);
	            return followupRepositories.save(followup);
	        }
	        return null; // or throw an exception
	    }

	    public boolean deleteFollowup(Integer id) {
	        if (followupRepositories.existsById(id)) {
	        	followupRepositories.deleteById(id);
	            return true;
	        }
	        return false; // or throw an exception
	    }

}
