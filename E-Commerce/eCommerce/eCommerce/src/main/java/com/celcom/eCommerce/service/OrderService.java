package com.celcom.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celcom.eCommerce.model.Orders64;
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
	
	public Orders64 addOrder(Orders64 newOrder) {
		
		return orderRepository.save(newOrder);
	}
	
	public String orderStatus(int id) {
		
		return orderRepository.getStatus(id);
	}
	
	public List<Orders64> getOrders(){
		return orderRepository.findAll();
	}
	

}
