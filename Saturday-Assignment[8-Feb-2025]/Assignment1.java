package com.celcom.assignments;

class Person{
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println(name+" "+age);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Pravalika",21);
		Person p2 = new Person("Heshu",15);
		p1.display();
		p2.display();
		

	}

}
