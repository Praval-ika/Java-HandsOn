package com.celcom.day6;

public class TryAndCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			//int a = 10/0;
			//int a = Integer.parseInt("Hi");
			int arr[] = new int[-5];
			System.out.println("Hello");
		} catch (ArithmeticException e) {
			System.out.println("A");
		}
		catch(NumberFormatException e)
		{
			System.out.println("B");
		}
        catch (NegativeArraySizeException e)
		{
        	System.out.println("C");
        	try {
        		int a = Integer.parseInt("ab");
        	}
        	catch(NumberFormatException e1){
        		System.out.println(e1);
        	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("After Exception");

	}
}
