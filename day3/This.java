package com.celcom.day3;

public class This {

	String name;
	This()
	{
		this("Pravalika");
	}
	
	This(String name)
	{
		this.name = name;
		this.greetings();
	}
	void greetings()
	{
		System.out.println("Hello "+name+"!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        This obj1 = new This();		
 
	}

}
