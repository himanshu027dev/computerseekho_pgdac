package com.example.services;

import com.example.entities.Followup;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface FollowupService {


	

	    public List<Followup> getAllFollowups() ;

	    public Optional<Followup> getFollowupById(Integer id);

	    public Followup createFollowup(Followup followup);

	    public Followup updateFollowup(Integer id, Followup followup);

	    public boolean deleteFollowup(Integer id);
}
