package com.celcom.day4;

class Animal{
	void move()
	{
		System.out.println("Can not move");
	}
	void eat()
	{
		System.out.println("Can not define");
	}
	
}

class Cat extends Animal{
	void move()
	{
		System.out.println("Cat will walk by walk");
	}
	
	void eat()
	{
		System.out.println("Cat will eat rat");
	}
}

class Parrot extends Animal{
	void move()
	{
		System.out.println("Parrot will move by flying");
	}
	void eat()
	{
		System.out.println("Parrot will eat fruits");
	}
}

class Fish extends Animal{
	void move()
	{
		System.out.println("Fish will move by fins");
	}
	void eat()
	{
		System.out.println("Fish will eat seaplants");
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		animal = new Cat();
		animal.move();
		animal.eat();
		
		animal = new Parrot();
		animal.move();
		animal.eat();
		
		animal = new Fish();
		animal.move();
		animal.eat();
		}
}
