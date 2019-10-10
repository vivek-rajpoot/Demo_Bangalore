/*
*AdminServiceImpl.java
*Created By		:Kamal Thapa
*Created Date	:Apr 4, 2018
*/
package com.rural.webservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.rural.model.BatchTemp;
import com.rural.model.DiviceMaster;
import com.rural.model.LoginResponse;
import com.rural.model.UserMaster;
import com.rural.webservice.dao.VendorUserDAO;


@Component
@Service
public class VendorUserServiceImpl implements VendorUserService {
	@Autowired
	VendorUserDAO userDAO;

	@Override
	public int validateUser(String userName, String password) {
		// TODO Auto-generated method stub
		return userDAO.validateUser(userName,password);
	}

	@Override
	public LoginResponse getDeviceInfo(DiviceMaster diviceMaster) {
		// TODO Auto-generated method stub
		return userDAO.getDeviceInfo(diviceMaster);
	}

	@Override
	public BatchTemp getStates() {
		// TODO Auto-generated method stub
		return userDAO.getStates();
	}

	@Override
	public UserMaster validateUser(int userId) {
		// TODO Auto-generated method stub
		return userDAO.validateUser(userId);
	}
}

	

	
	
