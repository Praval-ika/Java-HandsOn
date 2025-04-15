package com.celcom.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.celcom.eCommerce.model.Orders64;

import jakarta.transaction.Transactional;

@EnableTransactionManagement
public interface OrderRepository extends JpaRepository<Orders64,Integer> {

	@Modifying
	@Transactional
	@Query(value="INSERT INTO Orders(accountId,productId,quantity) values(?1,?2,?3)",nativeQuery=true)
	void addOrder(int accountId,int productId,int quantity);
	
	@Query(value="SELECT status FROM order_66 WHERE id = ?1",nativeQuery=true)
	String getStatus(int id);

}
