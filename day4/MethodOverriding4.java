package com.celcom.day4;

class Animal2{
	String mng = getMessage();
	
	String getMessage()
	{
		return "A";
	}
}

class Cat2 extends Animal2{
	
	String getMessage()
	{
		return "B";
	}
}

public class MethodOverriding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 animal = new Cat2();
		System.out.println(animal.mng);
    }
}
 