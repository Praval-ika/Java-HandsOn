package com.celcom.BankApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celcom.BankApp.model.Account;
import com.celcom.BankApp.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
    public Account createAccount(Account account) {
		
		return accountRepository.save(account); 
	}
    
    public Optional<Account> getAccount(long id){
    	
    	return accountRepository.findById(id);
    }
	
    public Account deposit(long id, double amount) {
    	
    	
    	Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
    	account.setBalance(account.getBalance()+amount);
    	
    	return accountRepository.save(account);
    	
    }
    
    public Account withdraw(long id,double amount) {
    	
    	Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
    	if(amount > account.getBalance()) {
    		throw new RuntimeException("Insufficient funds"); 
    	}
    	else {
    		account.setBalance(account.getBalance()-amount);
    		return accountRepository.save(account);
    	}
    }
    

}
