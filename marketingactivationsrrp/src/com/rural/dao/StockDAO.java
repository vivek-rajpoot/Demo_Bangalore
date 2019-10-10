/*
*StockDAO.java
*Created By		:SaiTej Deep
*Created Date	:Jul 4, 2018
*/
package com.rural.dao;

import java.util.List;
import java.util.Map;

import com.rural.model.CreateInvoices;
import com.rural.model.ItemDescriptionMaster;
import com.rural.model.Stock;
import com.rural.model.StockUsers;

public interface StockDAO {

	List<Stock> getAllStocks(Integer userId, String userRole);
	List<String> getAllStates();
	public boolean addStock(Stock s);
	public boolean addInvoice(CreateInvoices invoice);
	public String saveInvoice(Stock stock);
	List<String> getAllCities(String state);
	public CreateInvoices getInvoiceItemsByBillNumber(String billNumber);
	public List<CreateInvoices> getInvoiceItemsByInvoice(String billNumber);
	public Stock getStockByBillNumber(String billNumber);
	List<ItemDescriptionMaster> getAllitemDesc();
	List<StockUsers> getSKUDetails(Integer username, String userRole, Integer intMonth, Integer intYear);
	List<String> getUsers(String userRole);
	public String approveInvoices(String strinvoiceId, String status, String strComments);
	public String rejectInvoices(String strinvoiceId, String status, String strComments);
	String getOutletAndGSTNos(String billNumber);
	
	
}
	
		
	
