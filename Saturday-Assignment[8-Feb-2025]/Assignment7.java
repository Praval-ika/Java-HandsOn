package com.celcom.assignments;
import java.util.Scanner;
import java.util.ArrayList;

class Book1 {
	String title;
	String author;
	long ISBN;
	Book1() {
		
	}
	Book1(String title, String author, long ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	static ArrayList<Book1> books = new ArrayList<>();
	
	void addBook() {
		books.add(this);
		System.out.println("Book Added");
	}
	
//	void removeBook(long ISBN) {
//		for(Book1 book:books) {
//			if(ISBN == this.ISBN) {
//				books.remove(book);
//				System.out.println("Book with ISBN " + ISBN + " has been removed successfully");
//			}
//			else {
//				System.out.println("Book with ISBN cannot be found");
//			}
//		}
		
			
		
//	}
	
	void displayBooks() {
		if(books.isEmpty()) {
			System.out.println("No books were found");
		}
		else {
			for(Book1 book : books) {
				System.out.println("Book Name : " + book.title + " ISBN : " + book.ISBN + " Author : " + book.author);
			}
		}
	}
	
}

public class BookExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.println("Enter the Choice");
			System.out.println("1.Add new book");
			System.out.println("2.Delete a book");
			System.out.println("3.Display all the books"); 
			int choice = sc.nextInt();
			if(choice == 1) { 
				System.out.println("Enter the book name,Author name and ISBN");
				
				Book1 book = new Book1(sc.next(),sc.next(), sc.nextLong());
				book.addBook();
				
			}
			else if(choice == 2) {
				Book1 book = new Book1();
				System.out.println("Enter the ISBN of book to be delete");
				long value = sc.nextLong();
				for(Book1 bookk:Book1.books) {
					if(value == bookk.ISBN) {
						Book1.books.remove(bookk);
						System.out.println("Book with ISBN " + value + " has been removed successfully");
						break;
					}
					else {
						System.out.println("Book with ISBN cannot be found");
					}
				}
			}
			else if(choice == 3) {
				Book1 book = new Book1();
				book.displayBooks();
			}
			
			else {
				System.out.println("Enter a valid choice");
				break;
			}
		}
		

	}

}
