package com.celcom.day4;

public class Polymorphism {

	void myMethod(int n) {
		int fact = 1;
		for(int i = 1;i<=5;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial: "+fact);
		
	}
    void myMethod(int a,int b) {
    	int sum = a+b;
    	System.out.println(sum);
		
	}
    void myMethod(String name){
	      System.out.println("Hi "+name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism obj = new Polymorphism();
		obj.myMethod(5);
		obj.myMethod(5,5);
		obj.myMethod("Pravalika");
		

	}

}
