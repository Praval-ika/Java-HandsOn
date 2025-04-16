package com.celcom.eCommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_66")
public class Product64 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_seq")
	@SequenceGenerator(name="product_seq", sequenceName = "product_sequence",allocationSize = 1)
	private int id;
	private String name;
	private String category;
	private float price;
	private int stock;
	
	@Transient
	private String productId;
	
	public String getProductId() {
		
		return "PROD"+id;
	}

}
