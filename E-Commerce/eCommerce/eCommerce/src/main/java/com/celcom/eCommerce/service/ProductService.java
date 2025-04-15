package com.celcom.eCommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celcom.eCommerce.model.Product64;
import com.celcom.eCommerce.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product64 createProduct(Product64 product) {
		
		return productRepository.save(product);
	}
	
	public Optional<Product64> getProduct(int id) {
		return productRepository.findById(id);
	}

	public List<Product64> getALLProducts() {
		
		return productRepository.findAll();
	}
	
}
