package com.celcom.OrderProcessing.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.celcom.OrderProcessing.model.OrderDetails;
import com.celcom.OrderProcessing.model.OrdersModel;
import com.celcom.OrderProcessing.model.PaymentDetails;

import jakarta.transaction.Transactional;

public interface BillRepository extends JpaRepository<OrdersModel,Integer>{
	
	@Query(value="select * from order_66 where status = 'New' ",nativeQuery=true)
	List<OrdersModel> checkOrders();
	
	@Transactional
	@Modifying
	@Query(value="update order_66 set status = 'InProgress' where id=?1",nativeQuery=true)
	void updateStatus(int orderId);
	
	@Query(value="SELECT price, stock FROM product_66 WHERE stock >= ?1 AND id = ?2",nativeQuery=true)
	Optional<OrderDetails> checkStock(int quantity,int id);
	
	@Transactional
	@Modifying
	@Query(value="update product_66 set stock = ?1 where id = ?2",nativeQuery=true)
	void updateStock(int stock,int id);
	
	@Transactional
	@Modifying
	@Query(value="update order_66 set price = ?1,status = 'Pending Payment' where id =?2",nativeQuery=true)
	void updatePrice(float price,int orderId);
	
	@Transactional
	@Modifying
	@Query(value="update Order_66 set status = 'Stock Unavailable' where status = 'InProgress'",nativeQuery=true)
	void updateStatus1();
	
	@Query(value="select payment_Method,payment_Details,status from customer_66 where id = ?",nativeQuery=true)
	PaymentDetails getPaymentDetails(int id);
	
	@Transactional
	@Modifying
	@Query(value="update order_66 set status = ?1 where id = ?2",nativeQuery=true)
	void updateStatus2(String status, int id);
}
