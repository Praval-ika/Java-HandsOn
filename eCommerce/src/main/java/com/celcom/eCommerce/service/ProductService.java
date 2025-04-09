package com.celcom.eCommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.celcom.eCommerce.model.Product;
import com.celcom.eCommerce.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}
	
	public Optional<Product> getProduct(int id) {
		return productRepository.findById(id);
	}

	public List<Product> getALLProducts() {
		
		return productRepository.findAll();
	}
	
}
