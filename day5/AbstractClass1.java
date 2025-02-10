package com.celcom.day5;

abstract class Vehicle{
	
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
	
	abstract void noOfWheels();
	
	abstract void brandName();
}

class Car extends Vehicle{
	
	void noOfWheels()
	{
		System.out.println("I have four wheels");
	}
	
	void brandName()
	{
		System.out.println("Brand name is Jaguar");
	}
}

abstract public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car();
		car.noOfEngine();
		car.noOfWheels();
		car.brandName();
	}

}
