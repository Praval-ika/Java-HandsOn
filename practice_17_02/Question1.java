//Convert ArrayList to LinkedList and vice versa.
package com.celcom.practice_17_02;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Question1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		List<Integer> list1 = new LinkedList<>();
		System.out.println("Enter the no. of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++)
		{
			list1.add(sc.nextInt());
		}
		//Linked_to_Array
		List<Integer> list2 = new ArrayList<>(list1);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.getClass());
		System.out.println(list2.getClass());
		
		//Array_to_Linked
		List<Integer> list3 = new LinkedList(list2);
		
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list2.getClass());
		System.out.println(list3.getClass());
		sc.close();
	}

}
