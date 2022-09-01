package com.finance.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.model.Product;
import com.finance.model.ProductHistory;
import com.finance.repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository prodRepo;
	@Override
	public List<Product> viewProduct() {
		
		return prodRepo.findAll();
	}
	@Override
	public Product findProduct(int prodid) {
		return prodRepo.findById(prodid).get();
	}
	@Override
	public String addProducts(Product product) {
		// TODO Auto-generated method stub
		prodRepo.save(product);
		return "Added";
	}
	@Override
	public List<Product> viewProductByName(String prodname) {
		// TODO Auto-generated method stub
		return prodRepo.findByProdname(prodname);
	}

}
