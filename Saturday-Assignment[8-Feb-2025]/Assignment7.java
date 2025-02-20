package com.celcom.assignments;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Account{
	
	//long accountNumber;
	String accountHolderName;
	String branchName;
	long phoneNumber;
	double balance;
	
	Account(String accountHolderName, String branchName,long phoneNumber){
		
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.phoneNumber = phoneNumber;
		this.balance = 0.0;
	}
	
//	public void deposit(double amount) {
//		balance += amount;
//	}
//	
//	public void withDraw(double amount)
//	{
//		balance -= amount;
//	}
	
}


class Bank{
	
	private Map<Long,Account> bank = new HashMap<>();
    Scanner sc = new Scanner(System.in);
	//Account account = new Account(sc.nextLong(), sc.next(), sc.next(), sc.nextLong()); // new account creation.
	
    
    public void addAccount()
    {
    	System.out.println("Enter the Name,BranchName and PhoneNumber: ");
    	String name = sc.next();
    	String branchName = sc.next();
    	long phoneNum = sc.nextLong();
    	
    	Account account = new Account(name,branchName,phoneNum);
    	long newAccountNum = bank.size()+1;
    	bank.put(newAccountNum, account);
    	System.out.println("Account added Successfully \n Your Account Number is : " + newAccountNum);
    }
    
  
    
	public void deposit(){
		System.out.println("Enter the account number");
		long accountNumber = sc.nextLong();
		System.out.println("Enter the amount");
		double amount1 = sc.nextDouble();
		if(bank.containsKey(accountNumber)) {
			if(amount1<1){
				System.out.println("Enter valid amount.");
			}
	        else{
	        	Account account = bank.get(accountNumber);
	        	account.balance += amount1;
	        	System.out.println("Amount credited successfully.");
	        	return;
	        }
		}
		System.out.println("Account does not found");
		
	}
	
	public void withDraw() {
		System.out.println("Enter the account number");
		long accountNumber = sc.nextLong();
		System.out.println("Enter the amount");
		double amount1 = sc.nextDouble();
		if(bank.containsKey(accountNumber)) {
			if(amount1<1){
				System.out.println("Enter valid amount.");
			}
			else{
				Account account = bank.get(accountNumber);
				if(account.balance<amount1) {
					System.out.println("Insufficient balance");
					return;
				}
				account.balance -= amount1;
				System.out.println("Amount Debited successfully.");
				return;
			}
		}
		System.out.println("Account does not found");
	}
	
	
	
	public void getCurrentAccountDetails() {
		System.out.println("Enter the account Number: ");
		long accountNumber = sc.nextLong();
		if(bank.containsKey(accountNumber)) {
			
			System.out.println("Account Holder Name :" + bank.get(accountNumber).accountHolderName);
			//System.out.println("Account Number :" + bank.get(accountNumber).accountNumber);
			System.out.println("Branch Name :" + bank.get(accountNumber).branchName);
			System.out.println("Account Balance :" + bank.get(accountNumber).balance);
			System.out.println("Customer Phone Number :" + bank.get(accountNumber).phoneNumber );
			return;
		}
		System.out.println("Account not found.");
	}
	
	public void getAllAccountDetails() {
		
		for(Account allDetails : bank.values()) {
			
			System.out.println("Account HolderName :" + allDetails.accountHolderName);
			//System.out.println("Account Number :" + allDetails.accountNumber);
			System.out.println("Branch Name :" + allDetails.branchName);
			System.out.println("Customer Phone Number :" + allDetails.phoneNumber);
			System.out.println("Account Balance :" + allDetails.balance);
			}
	}
	
	public void deleteAccount() {
		
		System.out.println("Enter the account Number: ");
		long accountNumber = sc.nextLong();
		if(bank.containsKey(accountNumber)) {
			bank.remove(accountNumber);
			System.out.println("Account removed Successfully.");
			return;
		}
		System.out.println("Account not found to delete.");
	}
}

public class Assignment7 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(true) {
			System.out.println(" 1.Add Account\n 2.Deposit\n 3.Withdraw\n 4.Get Your AccountDetails\n 5.Get All Account Details\n 6.Delete Account\n 7.Exit");
			System.out.println("Please enter your choice");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					bank.addAccount();
					break;
				
				case 2:
					bank.deposit();
					break;
				
				case 3:
					bank.withDraw();
					break;
				
				case 4:
					bank.getCurrentAccountDetails();
					break;
				
				case 5:
					bank.getAllAccountDetails();
					break;
				case 6:
					bank.deleteAccount();
					break;
				case 7:
					return;
			
				default:
					System.out.println("Please Enter a Valid Choice");
				
			}
	    }
	}
}
