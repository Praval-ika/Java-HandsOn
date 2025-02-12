package com.celcom.main;

import com.celcom.Package1.MyClass1;
import com.celcom.pack2.MyClass2;
import com.celcom.*;
import com.*;
//import java.*; // invalid, as nothing gets imported

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass1 obj1 = new MyClass1();
		obj1.myMethod1();
		obj1.myMethod2();
		
		MyClass2 obj2 = new MyClass2();
		obj2.myMethod3();
		
	}

}
