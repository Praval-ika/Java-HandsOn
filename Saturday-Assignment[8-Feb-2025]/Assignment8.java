package com.celcom.assignments;

class Animal{
	void makeSound()
	{
		System.out.println("Makes sound");
	}
}

class Cat extends Animal{
	void makeSound(){
	System.out.println("Barks");}
}

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.makeSound();

	}

}
