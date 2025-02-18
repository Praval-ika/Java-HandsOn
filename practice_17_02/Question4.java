//checks if two arrays contain the same elements.
package com.celcom.practice_17_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		System.out.println("Enter the no. of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			list1.add(sc.nextInt());
		}
		
		System.out.println("Enter second array elements: ");
		List<Integer> list2 = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			list2.add(sc.nextInt());
		}
		if(list1.equals(list2))
		{
			System.out.println("Two array elements are equal.");
		}
		else {
			System.out.println("Two array elements are indifferent.");
		}
		
		sc.close();
	}

}
