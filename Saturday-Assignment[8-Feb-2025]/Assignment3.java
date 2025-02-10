package com.celcom.assignments;

class Rectangle{
	int width;
	int heigth;
	int area;
	
	Rectangle(int width,int heigth){
		this.width = width;
		this.heigth = heigth;
	}
	void calculateArea()
	{
		area = width*heigth;
	}
	
	void display()
	{
		System.out.println(area);
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(2,3);
		rectangle.calculateArea();
	    rectangle.display();
    }

}
