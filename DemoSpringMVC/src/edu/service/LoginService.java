package edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.model.Fresher;
import edu.repository.FresherRepository;

@Service
public class LoginService {
	@Autowired
	private FresherRepository fresherRepository;
	
	public boolean login(Fresher fresher) {
		Fresher saveFresher = fresherRepository.findByUsernameAndPassword(fresher.getUsername(), fresher.getPassword());
		return (saveFresher!=null);
	}
}
