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
	@Query(value="update order_66 set status = 'InProgress' where status = 'New'",nativeQuery=true)
	void updateStatus();
	
	@Query(value="SELECT o.id,o.product_Id,o.quantity,p.price,p.stock FROM order_66 o JOIN product_66 p ON p.id = o.product_Id WHERE o.QUANTITY <= p.STOCK AND o.STATUS = 'InProgress'",nativeQuery=true)
	Optional<OrderDetails> checkStock();
	
	@Transactional
	@Modifying
	@Query(value="update product_66 set stock = ?1 where product_Id = ?2",nativeQuery=true)
	void updateStock(int stock,int productId);
	
	@Transactional
	@Modifying
	@Query(value="update order_66 set price = ?1,status = 'Pending Payment' where orderId =?3",nativeQuery=true)
	void updatePrice(int price,int orderId);
	
	@Transactional
	@Modifying
	@Query(value="update Order_66 set status = 'Stock Unavailable' where status = 'InProgress'",nativeQuery=true)
	void updateStatus1();
	
	@Query(value="select o.account_Id,c.payment_Method,c.payment_Details,c.status from order_66 o join customer_66 c on c.id = o.accountId where o.id = ?",nativeQuery=true)
	PaymentDetails getPaymentDetails();
	
	@Transactional
	@Modifying
	@Query(value="update order_64 set status = ?1 where id = ?2",nativeQuery=true)
	void updateStatus2(String status, int id);
}
