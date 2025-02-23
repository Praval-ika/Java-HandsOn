package com.celcom.practice_23_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

class Task1 implements Callable<String>{
	
	private final String name;
	
	Task1(String name){
		this.name = name;
	}
	
	@Override
	public String call() {
		
		return (name + " Plan Expiration by today." +" Executed by "+Thread.currentThread().getName());
		 
	}
}

public class ExecutorService2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService executorservice = Executors.newFixedThreadPool(10);
		
		//By submit method
		System.out.println("By submit()");
						
		for(int i=1;i<=50;i++) {
		//Task task = new Task("customer "+i);
		executorservice.submit(new Task("customer "+i));
		}
		
		List<Task1> tasks = new ArrayList<>();
		for(int i=1;i<=50;i++) {
			tasks.add(new Task1("customer "+i));
		}
		//By invokeAll method
		
		System.out.println();
		System.out.println();
		
		System.out.println("By invokeAll()"); 
		System.out.println();
		
		List<Future<String>> futures = executorservice.invokeAll(tasks);
		for(Future<String> future : futures) {
			System.out.println(future.get());
		}
		
		System.out.println();
		System.out.println();
		
		//By invokeAny method
		System.out.println("By invokeAny()");
		
		String result = executorservice.invokeAny(tasks);
		System.out.println(result);
		
		executorservice.shutdown();
	}
}
