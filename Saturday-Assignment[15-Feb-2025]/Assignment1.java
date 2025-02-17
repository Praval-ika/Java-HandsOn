package com.celcom.assignments1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

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
		System.out.println("Enter the element to be searched:");
        String searchValue = sc.next();
        if(list.contains(searchValue)) {
        	System.out.println("Element found.");
        	System.out.println("The index of "+searchValue+": "+list.indexOf(searchValue));
        	
        }

	}

}
