package com.rural.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rural.dao.LoginDAO;
import com.rural.model.AgencyMaster;
import com.rural.model.Roles;
import com.rural.model.SecurityAnswers;
import com.rural.model.SecurityQuestions;
import com.rural.model.StateMaster;
import com.rural.model.StatusMaster;
import com.rural.model.UserMaster;
import com.rural.model.VendorMaster;

@Component
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO loginDAO;
	
	@Override
	public boolean checkLogin(String userName, String userPassword) {
		
		return loginDAO.validateLogin(userName, userPassword);
	}
	@Override
	public List<Roles> getRoles() {
		// TODO Auto-generated method stub
		return loginDAO.getRoles();
	}
	@Override
	public List<StateMaster> getStateMap() {
		// TODO Auto-generated method stub
		 return loginDAO.getStateMap();
	}

	@Override
	public List<AgencyMaster> getAgencyMap() {
		// TODO Auto-generated method stub
		return loginDAO.getAgencyMap();
	}

	@Override
	public List<StatusMaster> getStatusMap() {
		// TODO Auto-generated method stub
		return loginDAO.getStatusMap();
	}

	@Override
	public List<UserMaster> getNames(Integer Id, String firstName) {
		
		return loginDAO.getNamesList();
	}

	@Override
	public List<VendorMaster> getVendorMap() {
		// TODO Auto-generated method stub
		return loginDAO.getVendorMap();
	}

	@Override
	public List<SecurityQuestions> qList(Integer userId) {
		// TODO Auto-generated method stub
		return loginDAO.listQns(userId);
	}

	@Override
	public void saveAnswers(List<SecurityAnswers> ansList, Integer userId, String username, String strpassword) {
		// TODO Auto-generated method stub
		 loginDAO.saveAnswers(ansList, userId, username, strpassword);
	}

	@Override
	public int validateQuestions(Integer userId, List<SecurityAnswers> ansList) {
		// TODO Auto-generated method stub
		return loginDAO.validateQuestions(userId, ansList);
	}

	@Override
	public int countAns(String username) {
		// TODO Auto-generated method stub
		return loginDAO.countAns(username);
	}

	@Override
	public String getpassword(int userId) {
		// 
		return loginDAO.getPassword(userId);
	}
	@Override
	public  List<String> getMenuListbyRole(int roleId,String strAppType) {
		return loginDAO.getMenuListbyRole(roleId,strAppType);
	}

}
