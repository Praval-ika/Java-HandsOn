package com.celcom.day5;

interface VehiclePlan1{
	void noOfEngine();
}

interface VehiclePlan2{
	void noOfWheels();
	void brandName();
}

abstract class Vehicle1 implements VehiclePlan1,VehiclePlan2{
	 public void noOfEngine()
	{
		System.out.println("I have one engine");
	}
}


class Car1 extends Vehicle1{
	
	public void noOfWheels()
	{
		System.out.println("I have four wheels");
	}
	public void brandName()
	{
		System.out.println("Brand name is Jaguar");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 vec = new Car1();
		vec.noOfEngine();
		vec.brandName();
		vec.noOfWheels();

	}

}
