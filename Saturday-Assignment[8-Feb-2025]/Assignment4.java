package com.celcom.assignments;

import java.util.Scanner;

class Circle
{
	int radius;
	void area()
	{
		System.out.println(3.14*radius*radius);
	}
	void circumference()
	{
		System.out.println(2*3.14*radius);
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Scanner sc = new Scanner(System.in);
		circle.radius = sc.nextInt();
		circle.area();
		circle.circumference();

	}

}
