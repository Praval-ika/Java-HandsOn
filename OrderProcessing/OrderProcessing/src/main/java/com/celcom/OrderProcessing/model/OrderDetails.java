package com.celcom.OrderProcessing.model;

public interface OrderDetails {
	
	int getOrderId();
	int getProductId();
	int getQuantity();
	int getPrice();
	int getStock();	

}
