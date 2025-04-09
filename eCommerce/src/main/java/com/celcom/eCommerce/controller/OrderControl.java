package com.celcom.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celcom.eCommerce.model.ProductDetails;
import com.celcom.eCommerce.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderControl {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/{id}/{value}")
	public List<String> getCategories(@PathVariable int id,@PathVariable int value){
		
		if(value==1)
		return orderService.getCategories();
		else
		return null;
	}
	
    @GetMapping("/{id}/{value}/{category}")
	public List<ProductDetails> getCategoryDetails(@PathVariable String category){
		
		return orderService.getCategoryDetails(category);
	}
    
    @GetMapping("/{id}/{flag}/{category}/{value}")
    public String checkProductId(@PathVariable int value) {
    	
    	if(orderService.checkProductId(value))
    		return "Enter the Quantity.";
    	else
    		return "Failed : Enter valid Product Id.";
    }
    
    @GetMapping("/{id}/{flag}/{category}/{value}/{quantity}")
    public String addOrder(@PathVariable int id,@PathVariable int value,@PathVariable int quantity) {
    	
    	orderService.addOrder(id,value,quantity);
    	return "New Order Created.";
    }

}
