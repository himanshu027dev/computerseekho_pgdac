package com.javaguides.springboot.Model;

import java.util.Optional;

import com.javaguides.springboot.Entities.AdminLogin;

public interface AdminModel 
{
	void addAdmin(AdminLogin admin);
	//Optional<AdminLogin> getAdmin(String name);
	Optional<AdminLogin> getAdmin(AdminLogin admin);

}