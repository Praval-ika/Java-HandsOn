package com.celcom.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celcom.eCommerce.model.ProductDetails;
import com.celcom.eCommerce.repository.OrderRepository;
import com.celcom.eCommerce.repository.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	public List<String> getCategories(){
		
		return productRepository.findDistinctCategories();
	}

	public List<ProductDetails> getCategoryDetails(String category) {
		
		return productRepository.findCategoryDetails(category);	
	}
	
	public boolean checkProductId(int value) {
		
		return productRepository.existsById(value);
	}
	
	public void addOrder(int id,int value,int quantity) {
		
		orderRepository.addOrder(id,value,quantity);
	}
	

}
