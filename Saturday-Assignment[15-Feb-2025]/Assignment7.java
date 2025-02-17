package com.celcom.assignments1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Assignment7 {

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
		System.out.println("Enter the position to traverse the elements: ");
		int ind = sc.nextInt();
		for(int i = ind -1;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}	