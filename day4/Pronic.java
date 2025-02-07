package com.celcom.day4;

import java.util.Scanner;
public class Pronic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag=false;
		for(int i = 1;i<n;i++)
		{
			if(n%i==0 && n%(i+1)==0 && i*(i+1)==n)
			{
				flag = true;
				System.out.println("Pronic");
			}
		}
		if(!flag)
		{
			System.out.println("Not a Pronic");
		}
		sc.close();

	}
}
