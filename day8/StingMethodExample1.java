package com.celcom.day8;

public class StingMethodExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Pravalika";
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("Hello"));
		System.out.println(s1.replace('a','z'));
		
		System.out.println(s1.equals("pravalika"));
		System.out.println(s1.equalsIgnoreCase("pravalika"));
		System.out.println(s1.contains("lika"));
		System.out.println(s1.startsWith("Prava"));
		System.out.println(s1.endsWith("ka"));
		
		String s2 = "Java World";
		System.out.println(s2.substring(2,7));
		System.out.println(s2.substring(2));
		

	}

}
