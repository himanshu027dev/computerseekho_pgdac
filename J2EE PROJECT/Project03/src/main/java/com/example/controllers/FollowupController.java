package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.repositories.FollowupRepositories;
import com.example.entities.Followup;
import com.example.services.FollowupService;

@RestController
public class FollowupController {

	 @Autowired
	    FollowupService followupService;

	    @GetMapping(value="/api/followup")
	    public List<Followup> getAllFollowups() {
	        return followupService.getAllFollowups();
	    }

	    @GetMapping(value="/api/followup/{id}")
	    public Followup getFollowupById(@PathVariable Integer id) {
	        return followupService.getFollowupById(id).orElse(null);
	    }

	    @PostMapping(value="/api/followup")
	    public void createFollowup(@RequestBody Followup followup) {
	        followupService.createFollowup(followup);
	        System.out.println("Follow-up added successfully");
	    }

	  

	    @DeleteMapping(value="/api/followup/{id}")
	    public void deleteFollowup(@PathVariable Integer id) {
	    	Optional<Followup> follow = followupService.getFollowupById(id);
	    	if (follow.isPresent()) {
	            followupService.deleteFollowup(id);
	        }
	    }
}
