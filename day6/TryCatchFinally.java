package com.celcom.day6;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("Inside finally");
		}
		
		System.out.println("After Exception");

	}

}
