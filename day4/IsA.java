package com.celcom.day4;

class Vehicle{
	void engine() {
		System.out.println("All vehicles has an engine");
	}
	void wheels() {
		System.out.println("All vehicles have the wheels");
	}
}

class Wheels{
	void wheelModel() {
		System.out.println("Wheel model is MRF");
	}
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two wheele")) {
			System.out.println("I have two wheels");
		}
		else if(vehicleType.equals("Four wheels"))
		{
			System.out.println("I have four wheels");
		}
	}
}

class Engine{
	void engineModel() {
		System.out.println("Engine model is MRF");
	}
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}

class Car extends Vehicle{
	Wheels wheel = new Wheels();
	Engine engine = new Engine();
	
	void engineModel()
	{
		engine.engineModel();
	}
	void wheelModel()
	{
		wheel.wheelModel();
	}
	void noOfWheels()
	{
		System.out.println("Four wheels");
	}
}

public class IsA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car();
		 car.engine();
		 car.engineModel();
		 
		 car.wheels();
		 car.wheelModel();
		 car.noOfWheels();
		 
		
		

	}
}

