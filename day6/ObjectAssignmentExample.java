package com.celcom.day6;

public class ObjectAssignmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectAssignmentExample obj1 = new ObjectAssignmentExample();
		
		System.out.println(obj1.hashCode());
		
		ObjectAssignmentExample obj2 = obj1;
		
		System.out.println(obj2.hashCode());

	}

}
