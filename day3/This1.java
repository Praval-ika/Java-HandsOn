package com.celcom.day3;

public class This1 {

	This1()
	{
		this("Pravalika ");
		System.out.println("Welcome!!");
	}
	
	This1(String name)
	{
		this("Good" ,"Morning, ");
		System.out.print(name);
	}
	
	This1(String greet1,String greet2)
	{
		System.out.print(greet1+" "+greet2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        This1 obj = new This1();
	}

}
