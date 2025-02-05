package com.celcom.day2;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println("Array length : "+arr.length);
		System.out.println("Array elements:");
		int sum = 0;
		for(int ind = 0;ind<arr.length;ind++)
		{
			sum += arr[ind];
			System.out.print(arr[ind]+" ");
		}
		System.out.println(sum);
		for(int val: arr)
		{
			System.out.println(val);
		}

	}

}
