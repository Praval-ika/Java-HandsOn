package com.celcom.day2;

public class VariableTypes {

	int b = 20; // instance or object variable
	static int c = 30; // static or class variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //local variable
		System.out.println(a);
		
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.b);
		System.out.println(VariableTypes.c);

	}

}
