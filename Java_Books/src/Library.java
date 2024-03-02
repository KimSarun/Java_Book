import java.util.*;

public class Library {
	
	Dictionary<String, Book> dict = new Hashtable<>();
	
	public String add_book(String title, String author, String isbn) {
		if (((Hashtable<String, Book>) dict).containsKey(isbn)) {
			return "The book with ISBN: " + isbn + " is exist.";
		} else {
			dict.put(isbn, new Book(title, author, isbn));
			return "Added successfully";
		}
	}
	
	public String remove_book(String isbn) {
		if (((Hashtable<String, Book>) dict).containsKey(isbn)) {
			dict.remove(isbn);
			return "Removed successfully";
		} else {
			return "The book with ISBN: " + isbn + " doesn't exist";
		}
	}
	
	public String find_book(String isbn) {
		try {
		Book book = dict.get(isbn);
		return "Found the book with ISBN:" + isbn + "\nTitle: " + book.getTitle() + "\nAuthor: " + book.getAuthor();
		} catch (Exception e) {
			return "Something went wrong. The ISBN you entered doesn't match our record.";
		}
	}
}
