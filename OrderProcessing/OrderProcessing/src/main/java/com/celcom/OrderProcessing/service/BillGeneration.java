package com.celcom.OrderProcessing.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.celcom.OrderProcessing.model.OrdersModel;
import com.celcom.OrderProcessing.model.PaymentDetails;
import com.celcom.OrderProcessing.model.PaymentModel;
import com.celcom.OrderProcessing.model.OrderDetails;
import com.celcom.OrderProcessing.repository.BillRepository;
import com.celcom.OrderProcessing.repository.PaymentRepository;

import jakarta.annotation.PreDestroy;

@Service
public class BillGeneration {
	
	@Autowired 
	private BillRepository billRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	private final ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	@Scheduled(fixedDelay=600)
	public void ordersCheck() {
	
	List<OrdersModel> orders = billRepository.checkOrders();
	
	for(OrdersModel ord : orders) {
		executorService.submit(() -> {
            this.inprogressStatus();
            this.stockCheck();
		});    
	}
	shutDown();
	}	
	
	public void inprogressStatus() {
		
		billRepository.updateStatus();
	}
	
	public synchronized void stockCheck() {
		
		Optional<OrderDetails> ord = billRepository.checkStock();
		
		if (ord.isPresent()) {
		    OrderDetails order = ord.get();
		    try {
		        billRepository.updateStock(order.getStock() - order.getQuantity(), order.getProductId());
		        billRepository.updatePrice(order.getPrice() * order.getQuantity(), order.getOrderId());
		        payment(order.getPrice() * order.getQuantity(), order.getOrderId());
		    } catch (Exception e) {
		        System.err.println("Error processing order: " + order.getOrderId());
		        e.printStackTrace();
		    }
		}
		if(ord.isEmpty()) {
			
			billRepository.updateStatus1();
			shutDown();
		}
	}
	
	public void payment(float amount,int orderId) {
		
		PaymentDetails paymentDetails = billRepository.getPaymentDetails();

		PaymentModel paymentModel = new PaymentModel();
		paymentModel.setAccountId(paymentDetails.getAccountId());
		paymentModel.setPaymentMethod(paymentDetails.getPaymentMethod());
		paymentModel.setPaymentDetails(paymentDetails.getPaymentDetails());
		paymentModel.setPaymentStatus(paymentDetails.getPaymentStatus());
		paymentModel.setBill(amount);
		
		if(paymentDetails.getPaymentStatus().equals("Active")) {
			
			paymentModel.setOrderStatus("Success");
		}
		else
		{
			paymentModel.setOrderStatus("Failed");
		}
		
		paymentRepository.save(paymentModel);
		
		billRepository.updateStatus2(paymentModel.getOrderStatus(),orderId);
		
		shutDown();
				
	}
	
	@PreDestroy
	public void shutDown() {
	    executorService.shutdown();
	    try {
	        if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
	            executorService.shutdownNow();
	        }
	    } catch (InterruptedException e) {
	        executorService.shutdownNow();
	    }
	}
}
