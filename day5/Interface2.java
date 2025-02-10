package com.celcom.day5;

interface InterfaceOne{
	int a = 10;//by default public,static and final
}

interface InterfaceTwo{
	int a = 15;
	int b = 20;
}

interface InterfaceThree extends InterfaceOne,InterfaceTwo{
	void addition();
	
}

class Addition implements InterfaceThree{
	public void addition() {
		System.out.println(InterfaceOne.a+b);
	}
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System,in);
         InterfaceThree obj = new Addition();
         obj.addition();
	}
}
