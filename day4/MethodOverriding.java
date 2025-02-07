package com.celcom.day4;

class SuperClass
{
	void myMethod()
	{
		System.out.println("I am from super class");
	}
}

class SubClass extends SuperClass{
	void myMethod()
	{
		System.out.println("I am from sub class");
	}
	
}

public class MethodOverriding {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass ob = new SubClass();
		SuperClass obj = new SubClass();
		obj.myMethod();
		ob.myMethod();
   }
}
