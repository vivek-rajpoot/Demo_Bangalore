package com.rural.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rural.model.SecurityAnswers;
import com.rural.model.SecurityQuestions;
import com.rural.model.UserMaster;

@Component
public interface UserService {

	public UserMaster validateUser(String username,String password);
	public String saveAnswers(SecurityAnswers sAnswers);
	public int countLogin(String username);
	public String resethitcount(String username);
	public List<SecurityQuestions> securityQnsList();
	
}
