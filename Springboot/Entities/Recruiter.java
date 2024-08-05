package com.example.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="image_master")
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long path_id;

    private String path_name;
    private String url;
	public Long getId() {
		return path_id;
	}
	@Column
	public void setId(Long id) {
		this.path_id = id;
	}
	public String getName() {
		return path_name;
	}
	@Column
	public void setName(String name) {
		this.path_name = name;
	}
	public String getUrl() {
		return url;
	}
	@Column
	public void setUrl(String url) {
		this.url = url;
	}

    
}
