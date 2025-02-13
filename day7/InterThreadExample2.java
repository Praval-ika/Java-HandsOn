package com.celcom.day7;

import java.util.Scanner;

class SavingsAccount{
	private long balanceAmount;
	
	void deposit(long amount) {
		this.balanceAmount = this.balanceAmount + amount;
	}
	
	void withdraw(long amount) {
		this.balanceAmount = this.balanceAmount - amount;
	}
	
	long getBalanceAmount() {
		return this.balanceAmount;
		
	}
}

class Withdraw extends Thread{
	SavingsAccount savingsaccount ;
	
	Withdraw(SavingsAccount savingsaccount){
		this.savingsaccount = savingsaccount;
	}
	
	@Override
	public void run() {
		synchronized(savingsaccount) {
			System.out.println("Withdrawer is waiting for depositer..");
			try {
				savingsaccount.wait();
			}
			catch(InterruptedException e) {
			}
			System.out.println("Enter the amount to withdraw:");
			long amount = new Scanner(System.in).nextLong();
			savingsaccount.withdraw(amount);
			System.out.println(amount+" withdraw successfully");
			System.out.println("Balance : "+ savingsaccount.getBalanceAmount());
	
		}
	}
}

class Depositer extends Thread{
	SavingsAccount savingsaccount;
	
	Depositer(SavingsAccount savingsaccount){
		this.savingsaccount = savingsaccount;
	}
	
	public void run()
	{
		synchronized(savingsaccount) {
			System.out.println("Depositer is depositing...");
			
				System.out.println("Enter the amount to be deposited: ");
				long amount = new Scanner(System.in).nextLong();
				savingsaccount.deposit(amount);
				System.out.println(amount + " Deposited successfully");
				System.out.println("Balance : "+ savingsaccount.getBalanceAmount());
                savingsaccount.notify();			  
		}
		
	}
}

public class InterThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SavingsAccount savingsaccount = new SavingsAccount();
		
		Withdraw withdraw = new Withdraw(savingsaccount);
		withdraw.start();
		
		Thread.sleep(2000);
		
		Depositer depositer = new Depositer(savingsaccount);
		depositer.start();

	}

}
