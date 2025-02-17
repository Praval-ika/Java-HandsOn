package com.celcom.assignments1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class Assignment8 {

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
		Collections.reverse(list);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}	