package com.celcom.assignments;

class Employee{
	String name;
	String title;
	int salary;
	int bonus=5000;
	
	Employee(String name,String title,int salary)
	{
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	
	void calculateSalary() {
		System.out.println(salary+bonus);
	}
	
	void updateSalary(int salary) {
		this.salary = salary;
	}
}

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Pravalika","Trainee",15000);
		employee.calculateSalary();
		employee.updateSalary(20000);
		employee.calculateSalary();

	}

}

;