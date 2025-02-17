package com.celcom.assignments1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Assignment10 implements Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = sc.nextInt();
		for(int i =0 ;i<n;i++)
		{
			list.add(sc.next());
		}
		List<String> list2 = new LinkedList<>();
		list2.addall(list);
	    System.out.println(list);
	    System.out.println(list2);
	    System.out.println(list.hashCode());
	    System.out.println(list2.hashCode());
	}
}
