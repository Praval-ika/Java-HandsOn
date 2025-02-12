package com.celcom.day7;

interface Calculator{
	int calc(int a,int b);
}

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = (a,b) -> a+b;
 		System.out.println(c.calc(10,20)); //30
		
		c = (a,b) -> a*b;
		System.out.println(c.calc(10, 20)); //200

	}

}
