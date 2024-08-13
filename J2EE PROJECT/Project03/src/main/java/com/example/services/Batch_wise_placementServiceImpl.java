package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Batch;
import com.example.entities.Courses;
import com.example.entities.Image;
import com.example.repositories.Batch_wise_placementRepository;
import java.util.List;

@Service
public class Batch_wise_placementServiceImpl implements Batch_wise_placementService {

    @Autowired
    Batch_wise_placementRepository repo;

    @Override
    public List<Image> getBatch1Images() {
        return repo.findImagesByUrlPattern("batch1");
    }

    @Override
    public List<Image> getBatch2Images() {
        return repo.findImagesByUrlPattern("batch2");
    }

//   	
//    @Override
//	public List<Batch> getBatch() {
//		return repo.findAll();
//	}
//
//	@Override
//	public void addBatch(Batch batch) {
//		repo.save(batch);
//		
//	}
//	 @Override
//	    public void updatebatches(Batch batch, int id) {
//	        repo.updateCourseDetails(
//	        		batch.getCourseDescription(),
//	        		batch.getCourseDuration(),
//	        		batch.isCourseIsActive(),
//	        		batch.getCourseName(),
//	        		batch.getCourseSyllabus(),
//	                batch.getCoverPhoto(),
//	                batch.getVideoId(),
//	            id
//	        );
//	 }
//	
//	@Override
//	 public void softDeleteBatch(int id) {
//	        repo.deleteById(id);
//	    }
//    
    
    

}
