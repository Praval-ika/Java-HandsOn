package com.celcom.day2;

public class MethodType {

	void m1() {
		System.out.println("Instance method");
	}
	static void m2() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodType obj = new MethodType();
		obj.m1();
		MethodType.m2();

	}

}
