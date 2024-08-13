package com.example.repositories;

import com.example.entities.Batch;
import com.example.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface Batch_wise_placementRepository extends JpaRepository<Image, Long> {

    @Query("SELECT i FROM Image i JOIN i.album a WHERE a.AlbumName LIKE :batchname")
    List<Image> findImagesByUrlPattern(@Param("batchname") String batchname);
    
//    @Query(value="select * from batch_master where batch_name =:name")
//    public Batch findByBatchName(@Param("name")String batchName);
//    
    
}
