package com.celcom.practice_18_02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HackerTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the transactions number: ");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the amount stolen: ");
		int amount = sc.nextInt();
		boolean flag = false;
		for(int i:list) {
			int sum = 0;
			List<Integer> temp = new ArrayList<>();
			for(int j = list.indexOf(i);j<n;j++)
			{
				if((sum+=list.get(j))<=amount) {
					//sum+=list.get(j);
	                temp.add(list.get(j));		
	                //System.out.println(temp);    
				}		
				
			    if(sum ==amount) {
					System.out.println(temp);
					flag = true;
					//break;
				}
			}
		}
		if(!flag) {
			System.out.println("No suspicious transaction found.");
		}

	}

}

