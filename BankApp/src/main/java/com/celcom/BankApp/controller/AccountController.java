package com.celcom.BankApp.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celcom.BankApp.model.Account;
import com.celcom.BankApp.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping
	public Account createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	@GetMapping("/{id}")
	public Optional<Account> getAccount(@PathVariable long id) {
		return accountService.getAccount(id);
	}
	
	@PostMapping("/{id}/deposit")
	public Account deposit(@PathVariable long id, @RequestBody Map<String,Double> request) {
		
		double amount = request.get("amount");
		return accountService.deposit(id,amount);
	}
	
	@PostMapping("/{id}/withdraw")
	public Account withdraw(@PathVariable long id, @RequestBody Map<String,Double> request) {
		
		double amount = request.get("amount");
		return accountService.withdraw(id,amount);
	}
	
	
	
	
	

}
