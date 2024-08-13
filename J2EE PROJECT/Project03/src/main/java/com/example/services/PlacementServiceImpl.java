package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.ImageStudentDTO;
import com.example.entities.Image;
import com.example.repositories.Batch_wise_placementRepository;
import com.example.repositories.PlacementRepository;
import java.util.List;

@Service
public class PlacementServiceImpl implements PlacementService {

    @Autowired
    private PlacementRepository repo;
	
//  public List<Image> getStudentImages(String name){
//	return repo.findImagesByBatchname(name); 
//}
    
    
    @Override
    public List<ImageStudentDTO> getStudentplacement(String albumName){
        return repo.findStudentsWithPlacementDetails(albumName);
      }
}
