package com.finance.service;

import java.util.List;


import com.finance.model.ProductHistory;

public interface ProductHistoryService {
	
	public boolean addProduct(ProductHistory prodhist);
	public List<ProductHistory> viewProduct();
	

}
