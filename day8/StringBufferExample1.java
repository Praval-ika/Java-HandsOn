package com.celcom.day8;

public class StringBufferExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		StringBuffer s1 = new StringBuffer("Hello");
		
		s1.append(" world");
		System.out.println(s1);
		
		//StringBuilder
		
		StringBuilder s2 = new StringBuilder("Hello");
		s2.append(" World");
		System.out.println(s2);

	}

}
