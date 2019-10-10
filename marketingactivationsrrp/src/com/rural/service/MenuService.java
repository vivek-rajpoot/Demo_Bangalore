/*
*MenuService.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Jul 4, 2018
*/
package com.rural.service;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.rural.model.UserMaster;

@Component
public interface MenuService {
	public Map<String, Map<String,String>> getMenu(UserMaster user);

}
