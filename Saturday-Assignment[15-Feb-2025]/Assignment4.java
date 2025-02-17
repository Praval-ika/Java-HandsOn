package com.celcom.assignments1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment4 {

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
		Collections.reverse(list);
		System.out.println(list);
		sc.close();
		
	}
}	