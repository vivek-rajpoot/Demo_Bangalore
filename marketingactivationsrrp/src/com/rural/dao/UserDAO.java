package com.rural.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rural.model.SecurityQuestions;
import com.rural.model.UserMaster;

@Component
public interface UserDAO {

	public UserMaster validateUser(String username,String password);
	public List<SecurityQuestions> getAllitemDesc();
	public String resethitcount(String username);
	public int countLogin(String username);
}
