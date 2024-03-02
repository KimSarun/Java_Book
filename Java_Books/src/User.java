
public class User {
	public static void main(String[] args) {
		Library test = new Library();
		
		System.out.println(test.add_book("first", "author1", "001"));
		System.out.println(test.add_book("second", "author2", "002"));
		System.out.println(test.add_book("third", "author3", "003"));
		System.out.println(test.add_book("forth", "author4", "004"));
		System.out.println(test.add_book("fifth", "author5", "005"));
		System.out.println(test.add_book("sixth", "author6", "003"));
		
		System.out.println("\n" + test.find_book("001") + "\n");
		System.out.println("\n" + test.find_book("003") + "\n");
		
		System.out.println(test.remove_book("003"));
		System.out.println(test.remove_book("006"));
		
		System.out.println("\n" + test.find_book("003") + "\n");
		
	}

}
