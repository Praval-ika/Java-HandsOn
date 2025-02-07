package com.celcom.day4;

class Animal1{
	int a = 10;
	void move()
	{
		System.out.println("Can not move");
	}
}

class Cat1 extends Animal1{
	int a = 20;
	void move()
	{
		System.out.println("Cat will walk by legs");
	}
}

public class MethodOverriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal = new Cat1();
		animal.move();
		System.out.println(animal.a);
}
}
