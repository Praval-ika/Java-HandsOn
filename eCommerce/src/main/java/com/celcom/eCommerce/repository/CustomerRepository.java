package com.celcom.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celcom.eCommerce.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	

}
