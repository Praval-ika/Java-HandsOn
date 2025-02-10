package com.celcom.assignments;

import java.util.Scanner;
import java.util.ArrayList;

class Book{
	String title;
	String author;
	long ISBN;
	
	Book(String title,String author,long ISBN)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	static ArrayList<Book> books = new ArrayList<>();
	
	void addBooks()
	{
		books.add(this);
		System.out.println("Book added successfully");
	}
	
	void display()
	{
		for(Book b1:books)
		{
			System.out.println("Title name: "+b1.title);
			System.out.println("Author name: "+b1.author);
			System.out.println("ISBN: "+b1.ISBN);
			
		}
	}
	
	void deleteBooks(long choice)
	{
		for(Book b1 : books)
		{
			if(b1.ISBN == choice)
			{
				b1 = null;
				break;
			}
		}
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.println("1.Add a book 2. Delete a book 3. Display the books.")
		
		String title = sc.nextLine();
		String author = sc.nextLine();
		long ISBN = sc.nextLong();
		
		Book book = new Book(title,author,ISBN);
		book.addBooks();
        
		
		long choice = sc.nextLong();
		book.deleteBooks(choice);
	      	
		
		sc.close();
	}

}
