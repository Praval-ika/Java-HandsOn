package com.celcom.OrderProcessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celcom.OrderProcessing.model.PaymentModel;

public interface PaymentRepository extends JpaRepository<PaymentModel,Integer> {

}
