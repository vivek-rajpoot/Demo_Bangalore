/*
*VendorWarehouseServiceImpl.java
*Created By		:Bhagya Lakshmi Mula
*Created Date	:Apr 4, 2018
*/
package com.rural.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.rural.model.UserMaster;
import com.rural.model.VendorWareHouseMaster;
import com.rural.webservice.dao.WarehouseDAO;
import com.rural.webservice.dto.StatusMessages;
import com.rural.webservice.dto.WarehouseResponse;

@Service
@Configurable
public class VendorWarehouseServiceImpl implements VendorWarehouseService{

	@Autowired
	WarehouseDAO warehouseDAO;
	
	@Override
	public WarehouseResponse getWarehouses(int userId) {
		// TODO Auto-generated method stub
		return warehouseDAO.getWarehouses(userId);
	}

	@Override
	public StatusMessages addWarehouse(VendorWareHouseMaster warehouse) {
		// TODO Auto-generated method stub
		return warehouseDAO.addWarehouse(warehouse);
	}

	@Override
	public StatusMessages updateWarehouse(VendorWareHouseMaster warehouse) {
		// TODO Auto-generated method stub
		return warehouseDAO.updateWarehouse(warehouse);
	}

	@Override
	public UserMaster getVendorInto(String userId) {
		// TODO Auto-generated method stub
		return warehouseDAO.getVendorInto(userId);
	}
}
