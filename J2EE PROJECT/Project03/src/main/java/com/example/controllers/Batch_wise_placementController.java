package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Batch;
import com.example.entities.Courses;
import com.example.entities.Image;
import com.example.services.Batch_wise_placementService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Batch_wise_placementController {

    @Autowired
    private Batch_wise_placementService service;

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @GetMapping("/Batch1")
    public List<Image> getBatch1Images() {
        return service.getBatch1Images();
    }

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @GetMapping("/Batch2")
    public List<Image> getBatch2Images() {
        return service.getBatch2Images();
    }
    
    
    

//	@GetMapping(value="/api/admin/batch")
//	public List<Batch>getbatches(){
//		return service.getBatch();
//	}
//	@PostMapping(value="/api/admin/batch")
//	public void AddDetails(@RequestBody Batch batch) {
//		service.addBatch(batch);
//		System.out.print("Added successfully");
//	}
//	@PutMapping(value="/api/admin/batch/{id}")
//	public void updatebatches(@RequestBody Batch batch, @PathVariable int id) {
//	    service.updateBatch(batch, id);
//	}
//	@DeleteMapping(value="/api/admin/batch/{id}")
//	public void removebatches(@PathVariable int id) {
//		service.softDeleteBatch(id);
//	}


}
