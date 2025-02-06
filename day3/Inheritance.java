package com.celcom.day3;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("My brand name is TVS");
	}
}

class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("My brand is pep");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike tvs = new Bike();
		tvs.noOfEngine();
		tvs.noOfWheels();
		tvs.brandName();
		
		Scooty pep = new Scooty();
		pep.noOfEngine();
		pep.noOfWheels();
		pep.brandName();
    }

}
