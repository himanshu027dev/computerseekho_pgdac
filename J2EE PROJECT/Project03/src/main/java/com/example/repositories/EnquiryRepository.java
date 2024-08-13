package com.example.repositories;

import com.example.entities.Enquiry;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface EnquiryRepository extends JpaRepository<Enquiry, Long>{
    

    @Query(value="select * from enquiries where enq_email= :email",nativeQuery=true)
    Enquiry findByEmail(@Param("email") String email);


    // @Modifying
	// @Query("update Product p set p.name = :name,p.price = :price, p.qty=:qty where p.id = :id")
	// void update(@Param("name") String name,@Param("price") int price,@Param("qty") int qty,@Param("id")int id);
}