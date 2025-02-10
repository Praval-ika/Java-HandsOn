package com.celcom.day5;

import java.util.Scanner;

interface Area{
	void calculateArea();
}

interface Perimeter extends Area{
	void calculatePerimeter();
}

abstract class Shape implements Area,Perimeter{
	int radius;
	int len,breadth;
	float base,heigth;
	
	Shape(int radius)
	{
		this.radius = radius;
	}
	Shape(int len,int breadth)
	{
		this.len = len;
		this.breadth = breadth;
	}
	Shape(float base,float heigth)
	{
		this.base= base;
		this.heigth = heigth;
	}
	abstract public void calculateArea();
    
	abstract public void calculatePerimeter();
}

class Circle extends Shape
{
	Circle(int radius)
	{
		super(radius);
	}
	public void calculateArea()
	{
		double result = 3.14*radius*radius;
		System.out.println("Circle area: "+result);
	}
	
	public void calculatePerimeter()
	{
		double result = 2*3.14*radius;
		System.out.println("Circle perimeter: "+result);
	}
}

class Rectangle extends Shape{
	Rectangle(int length,int breadth)
	{
		super(length,breadth);
	}
	public void calculateArea()
	{
		double result = len*breadth;
		System.out.println("Rectangle area: "+result);
	}
	
	public void calculatePerimeter() {
		double result = 2*len*breadth;
		System.out.println("Rectangle perimeter: "+result);
	}
}

class Triangle extends Shape{
	Triangle(float base,float heigth)
	{
		super(base,heigth);
	}
	public void calculateArea()
	{
		double result = 0.5*base*heigth;
		System.out.println("Triangle area: "+result);
	}
	public void calculatePerimeter()
	{
		double result = 3*base;
		System.out.println("Triangle perimeter: "+result);
	}
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice:");
		System.out.println("1.Circle 2.Rectangle 3.Triangle");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			int radius;
			System.out.println("Enter radius:");
			radius = sc.nextInt();
			Shape c = new Circle(radius);
			c.calculateArea();
			c.calculatePerimeter();
			break;
		case 2:	
			int length,breadth;
			System.out.println("Enter length and breadth:");
			length = sc.nextInt();
			breadth = sc.nextInt();
			Shape r = new Rectangle(length,breadth);
			r.calculateArea();
			r.calculatePerimeter();
			break;
		case 3:
			float base,heigth;
			System.out.println("Enter base and heigth:");
			base = sc.nextFloat();
			heigth = sc.nextFloat();
			Shape t = new Triangle(base,heigth);
			t.calculateArea();
			t.calculatePerimeter();
			break;
		}
    }
}
