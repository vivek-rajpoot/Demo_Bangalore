/*
*AdminService.java
*Created By		:Kamal Thapa
*Created Date	:Apr 4, 2018
*/
package com.rural.webservice.service;

import org.springframework.stereotype.Component;

import com.rural.model.BatchTemp;
import com.rural.model.DiviceMaster;
import com.rural.model.LoginResponse;
import com.rural.model.UserMaster;

@Component
public interface VendorUserService {
public int validateUser(String userName, String password);
public LoginResponse getDeviceInfo(DiviceMaster diviceMaster);
public BatchTemp getStates();
public UserMaster validateUser(int userId);
}
