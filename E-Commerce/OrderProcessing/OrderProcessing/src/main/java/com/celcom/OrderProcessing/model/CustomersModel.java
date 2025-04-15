package com.celcom.OrderProcessing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_66")
public class CustomersModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String emailId;
	private String address;
	private String paymentMethod;
	private String paymentDetails;
	private String status;	
	
}
