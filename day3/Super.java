package com.celcom.day3;

class Vehicle1{
	
	String name = "I am a super class variable";
	Vehicle1(){
		System.out.println("I am the superclass constructor");
	}
	
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
}

class TwoWheeler1 extends Vehicle1{
	TwoWheeler1()
	{
		super();
		System.out.println("I am the subclass constructor");
	}
	
	void noOfWheels() {
		super.noOfEngine();
		System.out.println("I have two wheels");
		System.out.println(super.name);
	}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler1 v1 = new TwoWheeler1();
		v1.noOfWheels();
		

	}

}
