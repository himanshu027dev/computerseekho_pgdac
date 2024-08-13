package com.example.controllers;
import com.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.ImageStudentDTO;
import com.example.entities.Image;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;


@RestController
@RequestMapping("/api")
public class PlacementController {
	
//    @Autowired
//    private PlacementService service;
//    
//  @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
//  @GetMapping("/{batchname}")
//  public List<Image> getStudentImage(@PathVariable("batchname") String name) {
//      return service.getStudentImages(name);
//  }
//
//}

   
    @Autowired
    PlacementService service;
  @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @GetMapping("/{batchName}")
    public List<ImageStudentDTO> getAllStudent(@PathVariable String batchName) {
        // Decode the batchName to handle URL encoding
        String decodedBatchName = URLDecoder.decode(batchName, StandardCharsets.UTF_8);

        // Use the decoded batchName in the service method
        return service.getStudentplacement(decodedBatchName);
    }
}


