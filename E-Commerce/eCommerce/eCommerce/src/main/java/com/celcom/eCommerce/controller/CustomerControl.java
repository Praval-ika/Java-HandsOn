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

import com.celcom.eCommerce.model.Customer64;
import com.celcom.eCommerce.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerControl {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public String createCustomer(@RequestBody Customer64 customer) {
		System.out.println(customer.toString());
		//Customer newCustomer = customerService.createCustomer(customer);
		return " Success : Customer Added.\n Customer Id : "+customerService.createCustomer(customer).getId();
		
	}
	
	@GetMapping("/customers")
	public List<Customer64> getAllCustomers(){
		
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Optional<Customer64> getCustomer(@PathVariable int id) {
		
		return customerService.getCustomer(id);
	}
}
