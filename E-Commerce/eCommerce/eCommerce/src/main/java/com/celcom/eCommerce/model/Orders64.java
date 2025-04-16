package com.celcom.eCommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_66")
public class Orders64 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="order_seq")
	@SequenceGenerator(name="order_seq", sequenceName = "order_sequence",allocationSize = 1)
	private int id;
	int accountId;
        int productId;
	int quantity;
	private float price = 0.0F;
	private String status = "New";
	
	@Transient
	private String orderId;
	
	public String getOrderId() {
		
		return "ORD"+id;
	}
	
}
