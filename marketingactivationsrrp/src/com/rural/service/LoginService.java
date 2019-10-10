package com.rural.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.rural.model.AgencyMaster;
import com.rural.model.Roles;
import com.rural.model.SecurityAnswers;
import com.rural.model.SecurityQuestions;
import com.rural.model.StateMaster;
import com.rural.model.StatusMaster;
import com.rural.model.UserMaster;
import com.rural.model.VendorMaster;

@Component
public interface LoginService {

	 public boolean checkLogin(String userName, String userPassword);

	public List<Roles> getRoles();
	public List<StateMaster> getStateMap();
	public List<AgencyMaster> getAgencyMap();

	public List<StatusMaster> getStatusMap();

	public List<UserMaster> getNames(Integer id, String lastName);

	public List<VendorMaster> getVendorMap();

	public List<SecurityQuestions> qList(Integer userId);

	public void saveAnswers(List<SecurityAnswers> ansList, Integer userId, String username, String strpassword);

	public int validateQuestions(Integer userId, List<SecurityAnswers> ansList);

	public int countAns(String username);

	public String getpassword(int userId);

	public  List<String> getMenuListbyRole(int roleId,String strAppType);
}
