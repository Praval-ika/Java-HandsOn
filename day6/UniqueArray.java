package com.celcom.day6;

import java.util.Scanner;

class DuplicateException extends RuntimeException{
	
	DuplicateException()
	{
		System.out.println("Enter unique value - from constructor");
		
	}
	
	public String toString()
	{
		return "Enter unique values - toString()";
	}
}

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int ind = 0;ind<10;ind++){
			System.out.println("Enter the "+(ind+1)+" value:");
			arr[ind] =  sc.nextInt();
			for(int j = 0;j<ind;j++)
			{
				if(arr[j] == arr[ind])
				{
					try { 
					throw new DuplicateException();
					}
					catch(DuplicateException e)
					{
						System.out.println(e);
						ind--;
					}
				}
			}
		}
		

	}

}
