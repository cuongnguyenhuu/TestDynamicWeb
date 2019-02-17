package edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.model.Fresher;
import edu.repository.FresherRepository;

@Service
public class RegisterService {

	
	@Autowired
	private FresherRepository fresherRepository;
	
	public boolean register(Fresher fresher) {
		return (fresherRepository.save(fresher) != null);
	}
	
	
}
