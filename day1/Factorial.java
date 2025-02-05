package com.celcom.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int fact = sc.nextInt();
	    factorial(fact);	
	}
	public static void factorial(int i)
	{
		int sum = 1;
		while(i!=1)
		{
			sum *= i;
			i--;
		}
		System.out.println(sum);

	}
}
