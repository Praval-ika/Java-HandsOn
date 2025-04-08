package com.celcom.BankApp.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celcom.BankApp.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}
