package com.celcom.day2;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		System.out.println("Intial values of an Array:");
		for(int val:arr)
		{
			System.out.println(val);
		}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values:");
        for(int i = 0;i<5;i++)
        {
        	arr[i] = sc.nextInt();
        }
        System.out.println("User values of an Array:");
        int sum = 0,evenCount=0,oddCount=0;
        for(int val : arr)
        {
        	System.out.println(val);
        	sum+=val;
        	if(val%2==0)
        		evenCount++;
        	else
        		oddCount++;
        }
        System.out.println("Total sum : "+sum);
        System.out.println("Count of even : "+ evenCount);
        System.out.println("Count of odd : "+ oddCount);
        
	}

}
