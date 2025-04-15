package com.celcom.eCommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celcom.eCommerce.model.Product64;
import com.celcom.eCommerce.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductControl {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public String createProduct(@RequestBody Product64 product) {
		
		//Product newProduct = productService.createProduct(product);
		return " Success : Product Added.\n Product Id : " + productService.createProduct(product).getId();
	}
	
	@GetMapping("/products")
	public List<Product64> getAllProducts(){
		
		return productService.getALLProducts();
	}
	
	@GetMapping("/{id}")
	public Optional<Product64> getProduct(@PathVariable int id) {
		
		return productService.getProduct(id);
	}

}
