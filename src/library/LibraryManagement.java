package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryManagement {

	public static void main(String[] args) throws IOException, NullPointerException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Library library = new Library();
		do {
			System.out.println("Enter the Choice: \n\t"
					+ "1. Add Book\n\t"
					+ "2. View All Books\n\t"
					+ "3. Search Book by Id or Title\n\t"
					+ "4. Update Book Details\n\t"
					+ "5. Delete Book\n\t"
					+ "6. Exit");
			int ch = Integer.parseInt(input.readLine());
			switch(ch)
			{
			case 1: library.addBooks(); break;
			case 2: library.displayBooks();break;
			case 3: library.searchBook();break;
			case 4: library.updateBook();break;
			case 5: library.deleteBookByBookId();break;
			case 6: System.out.println("System Exited..."); System.exit(0);
			default: System.out.println("Enter Only numeric's in range of 1 to 6");
			}
			
			
		}while(true);
	}

}
