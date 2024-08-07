package com.example.model;

import java.util.Optional;

import com.example.entities.AdminLogin;

public interface AdminModel 
{
	void addAdmin(AdminLogin admin);
	//Optional<AdminLogin> getAdmin(String name);
	Optional<AdminLogin> getAdmin(AdminLogin admin);

}