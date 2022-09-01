package com.finance.service;

import java.util.List;

import com.finance.model.CardDetails;
import com.finance.model.ProductHistory;
import com.finance.model.User;

public interface FinanceService {
	public List<ProductHistory> getProducts(int regid);
	public List<User> getAllDetails();
	public User getDetailsByRegId(long regid);
	public String addDetails(User userDet);
	public CardDetails getCardDetailsByRegId(long regid);

}
