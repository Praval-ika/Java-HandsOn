package com.celcom.assignments;

class Shape{
	int getArea()
	{
		return 0;
	}
}

class Rectangle1 extends Shape{
	int length;
	int breadth;
	
	Rectangle1(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	int getArea()
	{
		return (length*breadth);
	}
}

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle1(10,20);
		System.out.println(rectangle.getArea());

	}

}
