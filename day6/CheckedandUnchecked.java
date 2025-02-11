package com.celcom.day6;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedandUnchecked {

	static void m1() throws FileNotFoundException{
		FileReader fr = new FileReader("abc.text");
	}
	
	static void m2() {
		try {
			m1();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		int a = 10/0;
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
