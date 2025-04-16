package com.celcom.eCommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_66")
public class Customer64 {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_seq")
	@SequenceGenerator(name="customer_seq", sequenceName = "customer_sequence",allocationSize = 1)
	private int id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String emailId;
	private String address;
	private String paymentMethod;
	private String paymentDetails;
	private String status;	
	
	@Transient
	private String customerId;
	
	public String getCustomerId() {
		
		return "CUST"+id;
	}	
	
}
