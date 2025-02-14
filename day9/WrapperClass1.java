package com.celcom.day9;

public class WrapperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		Integer obj1 = new Integer(a);//boxing
		int b = obj1.intValue();//unboxing
		
		//jdk 1.5 onwards
		Integer obj2 = a;//auto-boxing
		int c = obj2;//auto-unboxing

	}

}
