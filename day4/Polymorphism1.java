package com.celcom.day4;

public class Polymorphism1 {

	void addition(int a,int b)
	{
		System.out.println("Integer addition: "+(a+b));
	}
	void addition(double a,double b)
	{
		System.out.println("double addition: "+(a+b));
	}
	void addition(long a,long b)
	{
		System.out.println("long addition: "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism1 obj = new Polymorphism1();
		obj.addition(5, 5);
		obj.addition(5.0, 5.0);
		obj.addition(5L, 5L);
		

	}

}
