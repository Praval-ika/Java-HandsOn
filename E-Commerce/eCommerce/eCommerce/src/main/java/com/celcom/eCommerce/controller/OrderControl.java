package com.celcom.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celcom.eCommerce.model.Orders64;
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
    
    @PostMapping("/{id}/{flag}/{category}/{value}/{quantity}")
    public String addOrder(@RequestBody Orders64 newOrder) {
    	
    	return "New Order Created.\n Order Id is : "+ orderService.addOrder(newOrder).getOrderId();
    }
    
    @GetMapping("/{id}/{flag}/{category}/{value}/{quantity}/{orderId}")
    public String orderStatus(@PathVariable int orderId) {
    	
    	return "The Order Status is : "+ orderService.orderStatus(orderId);
    }
    
    @GetMapping("/orders")
    public List<Orders64> getOrders(){
    	return orderService.getOrders();
    }
}
