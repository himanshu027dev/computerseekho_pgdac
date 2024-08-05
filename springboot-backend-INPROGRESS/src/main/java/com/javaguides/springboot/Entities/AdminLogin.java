//package com.javaguides.springboot.Entities;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "Admin_Login")
//public class AdminLogin 
//{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int adminId;
//	private String name;
//	private String email;
//	private String password;
//	
//	
//	public AdminLogin(String name, String email, String password) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.password = password;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	
//
//}

package com.javaguides.springboot.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Admin_Login")
public class AdminLogin {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int adminId;
//    
//    @Column(nullable = false) // Consider adding constraints if needed
    private String name;
    
    @Column(nullable = false, unique = true) // Unique email address
    private String email;
    
    @Column(nullable = false) // Ensure that password cannot be null
    private String password;
    
    // Default constructor required by JPA
    public AdminLogin() {}

    // Constructor with parameters
    public AdminLogin(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
//    public int getAdminId() {
//        return adminId;
//    }
//
//    public void setAdminId(int adminId) {
//        this.adminId = adminId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

