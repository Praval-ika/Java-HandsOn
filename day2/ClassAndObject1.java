package com.celcom.day2;

class Employee{
	//Variable Declaration
	int eid;
	String ename;
	double esalary;
	
	//Constructor
	Employee(int eid,String ename, double esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		
	}
	
	//Method 
	void display() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee salary : " + esalary);
	}
}

public class ClassAndObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee valan=new Employee(101,"Valan",2000);
		valan.display();
		
		Employee Pravalika =new Employee(102,"Pravalika",3000);
		Pravalika.display();
		

	}

}
