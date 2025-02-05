package com.celcom.day1;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch = 1;
		do {
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the basic arithmetic operation:\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5.quit\n");
		ch = sc.nextInt();
		if(ch==1)
			System.out.println(a+b);
		else if(ch==2)
			System.out.println(a-b);
		else if(ch==3)
			System.out.println(a*b);
		else if(ch==4)
			System.out.println(a/b);
		else if(ch==5)
			System.out.println("exit");
		else
			System.out.println("Invalid");

	}while(ch!=5);
	}

}
