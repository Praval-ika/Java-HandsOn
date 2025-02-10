package com.celcom.assignments;

class Vehicle{
	void drive()
	{
		System.out.println("car is a vehicle");
	}
}

class Car extends Vehicle{
	void drive()
	{
		System.out.println("Repairing a car");
		
	}
}

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.drive();

	}
}
