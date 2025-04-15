package com.celcom.OrderProcessing.model;

public class BillDetails {
	
	public float amount;
	public int accountId;
	public int orderId;
	
	public BillDetails(float amount, int accountId, int orderId) {
		super();
		this.amount = amount;
		this.accountId = accountId;
		this.orderId = orderId;
	}

}
