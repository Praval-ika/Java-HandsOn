package com.celcom.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.celcom.eCommerce.model.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer> {

	@Query(value="INSERT INTO Orders(accountId,productId,quantity) values(?1,?2,?3)",nativeQuery=true)
	void addOrder(int id,int value,int quantity);

}
