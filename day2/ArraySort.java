package com.celcom.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);
		//Array input;
		for(int ind = 0;ind<5;ind++)
		{
			arr[ind] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("After sorting, Asc:");
		//Asc order;
		for(int val : arr) {
			System.out.print(val+" ");
		}
		//Desc order;
		System.out.println();
		System.out.println("After sorting,Dsc:");
		for(int ind = arr.length-1;ind>=0;ind--)
		{
			System.out.print(arr[ind]+" ");
		}
		System.out.println();
		//Printing min and max values
		System.out.println("Min Value: "+arr[0]);
		System.out.println("Second Min Value: "+arr[1]);
		System.out.println("Max value: "+arr[arr.length-1]);
		

	}

}
