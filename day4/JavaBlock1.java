package com.celcom.day4;

public class JavaBlock1 {

	{
		System.out.println("Instance block");
	}
	JavaBlock1(){
		System.out.println("Constructor");
	}
	public String toString()
	{
		return "To String";
	}
	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method block");
		
		JavaBlock1 obj = new JavaBlock1();
        System.out.println(obj);
	}

}
