package com.example.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Announcement;
import com.example.services.AnnoucementService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/admin/annoucement")
public class AnnoucementController {

	@Autowired
	AnnoucementService annoucementService;
	@GetMapping
	public String getAnnouncement() {
		return annoucementService.getText();
	}
	
	@PostMapping
	public void AddAnnoucement(@RequestBody Announcement annoucement) {
		System.out.println("Received: " + annoucement);
		annoucementService.Add(annoucement);
	}
	@PutMapping("/{id}")
    public void updateAnnouncement(@PathVariable int id, @RequestBody Announcement annoucement) {
        annoucementService.updateAnno(annoucement, id);
    }
	@DeleteMapping("/del/{id}")
	public void deleteAnno(@PathVariable int id) {
		annoucementService.delete(id);
	}

}

