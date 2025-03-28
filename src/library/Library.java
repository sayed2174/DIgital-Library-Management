package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Library {
	
	static HashMap<String, Book> bookList = new HashMap<>();
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public void addBooks() throws IOException
	{
		System.out.println("Enter Details\nBook ID:");
		String id = input.readLine();
		if(bookList.containsKey(id))
			System.out.println("Book ID is already Exists");
		else
		{
			System.out.println("Enter Title of book: ");
			String title = input.readLine();
			
			System.out.println("Enter Author of book: ");
			String author = input.readLine();
			
			if(title.length()==0 || author.length()==0) {
				System.out.println("Title and Author must be non empty");
				return;
			}
			
			System.out.println("Enter Genre of book: ");
			String genre = input.readLine();
			
			System.out.println("Enter status of book: (Status Need to be Available or Checked Out [case sensitive])");
			String status = input.readLine();
			
			if(!(status.contentEquals(new StringBuffer("Available")) || status.contentEquals(new StringBuffer("Checked Out"))))
			{
				System.out.println("Available Status Need to be Available or Checked Out [case sensitive]");
				return;
			}
			
			bookList.put(id, new Book(id,title,author,genre,status));
		}
		
	}
	
	
	public void displayBooks() {
		// Formatting the details of books such that data is in structured
		System.out.println("Books Details\n");
        System.out.printf("%-10s %-20s %-15s %-15s %-15s\n", "ID", "Title", "Author", "Genere", "Available Status");
        System.out.println("-----------------------------------------------------------------------");
		for(Book b:bookList.values())
	        System.out.printf("%-10s %-20s %-15s %-15s %-15s\n\n", b.getId(), b.getTitle(), b.getAuthor(), b.getGenre(), b.getStatus());
		
	}
	
	
	public void searchBook() throws IOException {
		System.out.println("Enter the Id or Title to Search Book");
		String searchKey = input.readLine();
		System.out.println(bookList.values().stream().filter(book -> book.getId().equals(searchKey) || book.getTitle().equalsIgnoreCase(searchKey)).findFirst().orElse(null));
	}
	
	
	public void updateBook() throws IOException {
		System.out.println("Enter Book Id: ");
		String key = input.readLine();
		if(bookList.containsKey(key))
		{
			Book book = bookList.get(key);	//book and Book objects in HashMap are store or references with same HashCode so book values changer the other values
			System.out.println("Enter new Data:\n Title\n Author\n Status\n :");
			book.setTitle(input.readLine());
			book.setAuthor(input.readLine());
			book.setStatus(input.readLine());
			System.out.println("Book Details Updated");
		}
		else
		{
			System.out.println("Book Not Found");
		}
		
	}
	
	
	public void deleteBookByBookId() throws IOException {
		System.out.println("Enter Book Id needed to Delete");
		String id = input.readLine();
		if(bookList.remove(id)!=null)
			System.out.println("Book was Deleted Successfully\n");
		else
			System.out.println("Book was not Found or exist\n");
		
	}
}
