package com.celcom.assignments;

import java.util.Scanner;
import java.util.ArrayList;

class Book{
	String title;
	String author;
	long ISBN;
	
	Book()
	{
		
	}
	
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
				b1.remove(b1);
				break;
			}
		}
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
        System.out.println("1.Add a book 2. Delete a book 3. Display the books.");
        
        int value = sc.nextInt();
        
        switch(value) {
        
        case 1:
		
		//String title = sc.next();
		//String author = sc.next();
		//long ISBN = sc.nextLong();
		
		Book book = new Book(sc.next(),sc.next(),sc.nextLong());
		book.addBooks();
		break;
        
        case 2:
		
        Book book1 = new Book();
		long choice = sc.nextLong();
		book1.deleteBooks(choice);
		break;
		
        case 3:
        	Book book2 = new Book();
        	book2.display();
        	break;	
        case 4:
        	return;
        	//break;
        	
        }
        
		}
	      	
		//sc.close();
		//}
	}
}
