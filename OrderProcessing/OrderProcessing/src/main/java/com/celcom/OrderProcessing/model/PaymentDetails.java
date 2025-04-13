package com.celcom.OrderProcessing.model;

public interface PaymentDetails {
	
	int getAccountId();
    String getPaymentMethod();
    String getPaymentDetails();
    String getPaymentStatus();    
}
