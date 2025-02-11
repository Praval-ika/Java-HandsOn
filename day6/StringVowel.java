package com.celcom.day6;

import java.util.Scanner;

class VowelNotFound extends Exception{
	
	public String toString()
	{
		return "Enter string with vowels.";
	}
	
}

public class StringVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int vowelCount=0;
		for(int ind = 0; ind<str.length();ind++)
		{
			if(str.charAt(ind)=='a'||str.charAt(ind)=='e'||str.charAt(ind)=='i'||str.charAt(ind)=='o'||str.charAt(ind)=='u') {
				vowelCount++;
			}
		}
		if(vowelCount==0) {
			try {
			throw new VowelNotFound();}
			catch(VowelNotFound e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("String accepted.");
		}
		

	}

}
