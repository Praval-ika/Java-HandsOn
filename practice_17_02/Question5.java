package com.celcom.practice_17_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the no. of elements:");
		int n = sc.nextInt();
		for(int i = 0;i < n ;i++)
		{
			list.add(sc.nextInt());
		}
		
		//asc 
		Collections.sort(list);
		System.out.println(list);
		
		//desc
		Collections.reverse(list);
		System.out.println(list);

	}

}
