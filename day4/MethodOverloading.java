package com.celcom.day4;

public class MethodOverloading {

	void concat(String s1, String s2)
	{
		System.out.println(s1+s2);
	}
	void concat(int a,int b)
	{
		System.out.println("Integer concatenation:"+a+b);
	}
	void concat(float a,float b)
	{
		System.out.println("Floating conact: "+a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MethodOverloading obj = new MethodOverloading();
        obj.concat("Welcome ","Home!");
        obj.concat(2.3f, 3.2f);
        obj.concat(2,3);
	}

}
