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
import com.celcom.OrderProcessing.model.BillDetails;
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
//	billRepository.updateStatus();
	
	for(OrdersModel ord : orders) {
		executorService.submit(() -> {
            this.inprogressStatus(ord);
            BillDetails billDetails = this.stockCheck(ord);
            payment(billDetails);
		});    
	}
	}	
	
	public void inprogressStatus(OrdersModel ord) {
		
		billRepository.updateStatus(ord.getId());
	}
	
	public synchronized BillDetails stockCheck(OrdersModel o) {
		
		try
		{
			Optional<OrderDetails> ord = billRepository.checkStock(o.getQuantity(),o.getProductId());

		if (ord.isPresent()) {
		    OrderDetails order = ord.get();
		    try {
		        billRepository.updateStock(order.getStock() - o.getQuantity(), o.getProductId());
		        billRepository.updatePrice(order.getPrice() * o.getQuantity(), o.getId());
		    } catch (Exception e) {
		        System.err.println("Error processing order: " + o.getId());
		        e.printStackTrace();
		    }
		    BillDetails billDetails = new BillDetails(order.getPrice() * o.getQuantity(),o.getAccountId(),o.getId());
		    return billDetails;
		}
		if(ord.isEmpty()) {
			
			billRepository.updateStatus1();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public void payment(BillDetails billDetails) {
		
		System.out.println(billDetails.accountId);
		PaymentDetails paymentDetails = billRepository.getPaymentDetails(billDetails.accountId);

		PaymentModel paymentModel = new PaymentModel();
		paymentModel.setAccountId(billDetails.accountId);
		paymentModel.setPaymentMethod(paymentDetails.getPaymentMethod());
		paymentModel.setPaymentDetails(paymentDetails.getPaymentDetails());
		paymentModel.setPaymentStatus(paymentDetails.getStatus());
		paymentModel.setBill(billDetails.amount);
		
		System.out.println(paymentModel.getPaymentStatus());
		if(paymentModel.getPaymentStatus().equals("Active")) {
			
			paymentModel.setOrderStatus("Success");
		}
		else
		{
			paymentModel.setOrderStatus("Failed");
		}
		
		paymentRepository.save(paymentModel);
		
		billRepository.updateStatus2(paymentModel.getOrderStatus(),billDetails.orderId);
		
				
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
