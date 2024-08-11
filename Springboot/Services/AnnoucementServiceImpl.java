package com.example.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.Announcement;
import com.example.Repositories.AnnouncementRepository;
@Service
public class AnnoucementServiceImpl implements AnnoucementService
{
	@Autowired
	AnnouncementRepository annoucementRepository;
	@Override
	public String getText() {
		return annoucementRepository.getAnnoucement();
	}
	@Override
	public void Add(Announcement annoucement) {
        annoucementRepository.save(annoucement);
	}
	@Override
    public void updateAnno(Announcement announcement, int id) {
        Optional<Announcement> existingAnnouncement = annoucementRepository.findById(id);
        if (existingAnnouncement.isPresent()) {
            Announcement updatedAnnouncement = existingAnnouncement.get();
            updatedAnnouncement.setAnnouncementText(announcement.getAnnouncementText());
            updatedAnnouncement.setAnnouncementDate(announcement.getAnnouncementDate());
            updatedAnnouncement.setIsActive(announcement.getIsActive());
            annoucementRepository.save(updatedAnnouncement);
        } else {
            throw new RuntimeException("Announcement with id " + id + " not found.");
        }
    }
	@Override
	public void delete(int id) {
		annoucementRepository.deleteById(id);
		
	}
		
		
	}
	

