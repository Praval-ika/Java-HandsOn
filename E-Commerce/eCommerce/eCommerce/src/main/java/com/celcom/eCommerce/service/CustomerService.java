package com.celcom.eCommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celcom.eCommerce.model.Customer64;
import com.celcom.eCommerce.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer64 createCustomer(Customer64 customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer64> getAllCustomers(){
		
		return customerRepository.findAll();
	}
	
	public Optional<Customer64> getCustomer(int id) {
		
		return customerRepository.findById(id);
	}
	
}
