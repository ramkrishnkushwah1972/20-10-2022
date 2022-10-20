/*	3.	Do the following:
	
	Create a class Book with id, name as the member variables.
	
	Create  BookNotFoundException as a exception and create one argument constructor which is accepting String message.
	
	Create a test class with an array of 5 books with ids starting from 1.
	
	Create a method findById(Book[] books , int id) which will take the previously created book array and one id to find the book.
	
	Print "Found" if the book is present with the given id else throw BookNotFoundException with a message "Book with the given id is not present".
	
	Handle the exception in main method and print the stacktrace in catch block.
*/

package com.exercise.demo;

public class BookTest {

	public static void main(String[] args) {

		//Create 5 book objects
		Book book1 = new Book(1,"Letus C");
		Book book2 = new Book(2,"Digital Computer");
		Book book3 = new Book(3,"GK");
		Book book4 = new Book(4,"Basic Computer");
		Book book5 = new Book(5,"Operating System");
		
		//Store all books details in books array
		Book books[] = {book1,book2,book3,book4,book5};
		
		//Find book By Id
		try {
			if(findById(books,10)) {
				System.out.println("Book is present");
			}
			else{
				throw new BookNotFoundException("Book with the given id is not present");
			}
		}catch(BookNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Function for search book
	public static boolean findById(Book[] books , int id) {
		for(Book b:books) {
			if(b.getId()==id)
			return true;
		}
		return false;
	}
}
