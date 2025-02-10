package com.celcom.assignments;

class Dog{
	String name;
	String breed;
	
	Dog(String name,String breed)
	{
		this.name = name;
		this.breed = breed;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	void display()
	{
		System.out.println(name+" "+breed);
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Tommy","Labrader");
		Dog d2 = new Dog("Mickie","German Sheperd");
		d1.display();
		d2.display();
		d1.setName("Jimmy");
		d1.setBreed("Bulldog");
		d2.setName("zize");
		d2.setBreed("Labrader");
		d1.display();
		d2.display();
		

	}

}
