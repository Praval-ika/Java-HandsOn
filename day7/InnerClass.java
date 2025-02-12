package com.celcom.day7;

public class InnerClass {

	//non - static inner class
	class InnerClass1{
		void myMethod1() {
			System.out.println("Non - static inner class");
		}
	}
	
	//static inner class
	static class InnerClass2{
		void myMethod1() {
			System.out.println("Static inner class");
		}
	}
	
	//local inner class
	void myMethod() {
	class InnerClass3{
		void myMethod1() {
			System.out.println("Local inner class");
		}	
	}
	InnerClass3 inner3 = new InnerClass3();
	inner3.myMethod1();
	}
	
	//Anonymous inner class
	interface MyInterface{
		void display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InnerClass obj = new InnerClass();
        
        InnerClass1 inner1 = obj.new InnerClass1();
        inner1.myMethod1();
        
        InnerClass.InnerClass2 inner2 = new InnerClass.InnerClass2();
        inner2.myMethod1();
        
        MyInterface obj1 = new MyInterface() {
        	public void display() {
        		System.out.println("Display-Anonymous inner class");
        	}
        };
        obj1.display();
        
        //lambda exp
        MyInterface obj2 = ()-> System.out.println("Display-lambda");
        obj2.display();
        
	}

}
