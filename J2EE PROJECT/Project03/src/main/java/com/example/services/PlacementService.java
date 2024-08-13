package com.example.services;

import com.example.DTO.ImageStudentDTO;
import com.example.entities.Image;
import java.util.List;

public interface PlacementService {
	//List<Image> getStudentImages(String name);
	 List<ImageStudentDTO> getStudentplacement(String albumName);
	
}
