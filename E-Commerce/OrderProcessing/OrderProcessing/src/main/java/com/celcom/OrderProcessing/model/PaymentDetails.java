package com.celcom.OrderProcessing.model;

public interface PaymentDetails {
	
    String getPaymentMethod();
    String getPaymentDetails();
    String getStatus();    
}
