package com.celcom.day7;

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Current Thread : "+t.getName());
		System.out.println("Current Thread Priority : "+t.getPriority());

	}

}
