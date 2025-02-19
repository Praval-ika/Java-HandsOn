package com.celcom.practice_18_02;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

class ContentManagementSystem{
	
	String title;
	String content;
	String tags;
	
	ContentManagementSystem(String title,String content,String tags){
		this.title = title;
		this.content = content;
		this.tags = tags;
	}
	
	public void titleFormat() {
		StringTokenizer st = new StringTokenizer(title," ");
		System.out.println("1. Title Formatting:");
		System.out.print("The formatted title is: ");
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.print(s.substring(0,1).toUpperCase()+" "+s.substring(1));
		}
	}
	
	
	public void tagFormat() {
		StringTokenizer st = new StringTokenizer(tags, " ");
		System.out.println("2. Tag Validation: ");
		List<String> invalidList = new ArrayList<>();
		List<String> validList = new ArrayList<>();
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(s.isEmpty()||s.length()>20) {
				invalidList.add(s);
			}
			else
			{
				validList.add(s);
			}
			for(String str:validList) {
				for(int i = 0;i<str.length();i++) {
					if(! Character.isLetter(str.charAt(i))) {
						validList.remove(str);
						invalidList.add(str);
						break;
					}
				}
			}
			if(!validList.isEmpty()) {
				System.out.println("Valid tags: "+validList);
			}
			else {
				System.out.println("All tags are invalid");
			}
			if(!invalidList.isEmpty()) {
				System.out.println("Invalid tags: "+invalidList);
			}
			else {
				System.out.println("All tags are valid.");
			}
			
		}
	}
	
	public void keywordExtraction() {
		String []s = content.split(". ");
		List<String> list = new ArrayList<>();
		System.out.println("3. Keyword Extraction and Validation:");
		for(String str : s) {
			if( !list.contains(str)) {
				list.add(str);
			}
			else
			{
				list.remove(str);
			}
		}
		if(!list.isEmpty()) {
			System.out.println("The unique keywords are: "+list);
		}
		else {
			System.out.println("No unique keywords.");
		}
	}
	
	public void contentCheck() {
		System.out.println("4. Content Length Check:");
		if(content.length()>2000) {
			System.out.println("Content is too long. Please shorten it.");
		}
		else {
			System.out.println("Content length is valid.");
		}
	}
	
	public void sentenceCount(){
		System.out.println("5. Sentence Count and Transformation:");
		String regex = "[.\\?\\!]";
		String []sentences = content.split(regex);
		System.out.println("The article has "+sentences.length+"sentences.");
		System.out.println("Transformed content:");
		System.out.println(content.toUpperCase());
	}
}

public class CMS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the article title: ");
		String title = sc.nextLine();
		
		System.out.println("Enter the article content: ");
		String content = sc.nextLine();

		System.out.println("Enter the tags (comma-separated): ");
		String tags = sc.nextLine();
		
		ContentManagementSystem cms = new ContentManagementSystem(title,content,tags);
		cms.titleFormat();
		
		cms.tagFormat();
		
		cms.keywordExtraction();
		
		cms.contentCheck();
		
		cms.sentenceCount();
		
		sc.close();
	}

}
