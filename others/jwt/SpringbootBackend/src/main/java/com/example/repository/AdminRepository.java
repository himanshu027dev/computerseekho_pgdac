package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.entities.AdminLogin;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<AdminLogin, String>
{
    // Custom query to find AdminLogin by email
    @Query("SELECT a FROM AdminLogin a WHERE a.email = :email")
    Optional<AdminLogin> findByEmail(@Param("email") String email);

}