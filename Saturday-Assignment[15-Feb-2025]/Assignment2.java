package com.celcom.assignments1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = sc.nextInt();
		for(int i =0 ;i<n;i++)
		{
			list.add(sc.next());
		}
		list.sort(null);
        System.out.println(list);
	}
}	
	