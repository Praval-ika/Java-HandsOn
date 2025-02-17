package com.celcom.assignments1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = sc.nextInt();
		for(int i =0 ;i<n;i++)
		{
			list.add(sc.next());
		}
		ArrayList<String> list2 = (ArrayList<String>) list.clone();
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list.hashCode());
	    System.out.println(list2.hashCode());
	}
}	
		