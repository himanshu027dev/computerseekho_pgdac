package com.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.javaguides.springboot.Entities.AdminLogin;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<AdminLogin, String>
{
    // Custom query to find AdminLogin by email
    @Query("SELECT a FROM AdminLogin a WHERE a.email = :email")
    Optional<AdminLogin> findByEmail1(@Param("email") String email);

    // Custom method to delete an AdminLogin by email
    //@Transactional
    //@Modifying
    //@Query("DELETE FROM AdminLogin a WHERE a.email = :email")
    //void deleteByEmail(@Param("email") String email);

    // Example of method naming convention for finding by email
    Optional<AdminLogin> findByEmail(String email);
}