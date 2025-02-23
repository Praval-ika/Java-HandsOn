package com.celcom.practice_23_02;

import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

class Task implements Runnable{
	
	private final String name;
	
	Task(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name + " Plan Expiration by today." +" Executed by "+Thread.currentThread().getName());
		
	}
}

public class ExecutorService1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executorservice = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<=50;i++) {
			//Task task = new Task("customer "+i);
			executorservice.submit(new Task("customer "+i));
		}

		executorservice.shutdown();

	}
}
