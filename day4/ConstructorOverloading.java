package com.celcom.day4;

public class ConstructorOverloading {
    
	ConstructorOverloading(int a,int b)
	{
		this(5.0,5.0);
		System.out.println("Integer addition: "+(a+b));
	}
	ConstructorOverloading(double a,double b)
	{
		this(5l,5l);
		System.out.println("double addition: "+(a+b));
	}
	ConstructorOverloading(long a,long b)
	{
		System.out.println("long addition: "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj = new ConstructorOverloading(5,5);
		//ConstructorOverloading obj1 = new ConstructorOverloading(5.0,5.0);
		//ConstructorOverloading obj2 = new ConstructorOverloading(5l,5l);

	}

}
