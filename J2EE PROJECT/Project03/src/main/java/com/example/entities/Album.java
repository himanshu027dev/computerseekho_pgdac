package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Album_master")
public class Album {

	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private int AlbumId;
	 	 private String AlbumName;
	     boolean IsActive;
	     
	     public int getAlbumId() {
			return AlbumId;
		}
		public void setAlbumId(int albumId) {
			AlbumId = albumId;
		}
		public String getAlbumName() {
			return AlbumName;
		}
		public void setAlbumName(String albumName) {
			AlbumName = albumName;
		}
		public boolean isIsActive() {
			return IsActive;
		}
		public void setIsActive(boolean isActive) {
			IsActive = isActive;
		}
	



}
