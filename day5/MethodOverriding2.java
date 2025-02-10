package com.celcom.day5;

interface AnimalPlan{
	void move();
	void eat();
}

abstract class Animal implements AnimalPlan{
	 abstract public void move();
	 abstract public void eat();
}

class Cat extends Animal{
	public void move()
	{
		System.out.println("Cat will walk by walk");
	}
	
	public void eat()
	{
		System.out.println("Cat will eat rat");
	}
}

class Parrot extends Animal{
	public void move()
	{
		System.out.println("Parrot will move by flying");
	}
	public void eat()
	{
		System.out.println("Parrot will eat fruits");
	}
}

class Fish extends Animal{
	public void move()
	{
		System.out.println("Fish will move by fins");
	}
	public void eat()
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
