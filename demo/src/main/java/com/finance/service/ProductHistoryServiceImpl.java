package com.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.model.ProductHistory;
import com.finance.repository.ProductHistoryRepository;
@Service
@Transactional
public class ProductHistoryServiceImpl implements ProductHistoryService {
	@Autowired
	ProductHistoryRepository prodhistRepo;
	@Override
	public boolean addProduct(ProductHistory prodhist) {
		prodhistRepo.save(prodhist);//inserts
		return true;
	}
	@Override
	public List<ProductHistory> viewProduct() {
		// TODO Auto-generated method stub
		return prodhistRepo.findAll();

	}

}
