import java.util.*;
class Book {
	String name;
	String author;
	int price;
	int num_pages;
	
	Book(String name, String author, int price, int num_pages) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.num_pages = num_pages;
	}
	
	public String toString() {
		return name + " " + author + " " + price + " " + num_pages;
	}
	
}

public class BookProgram {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Books");
		int n = sc.nextInt();
		Book bookArr[] = new Book[n]; 
		for(int i = 0; i < n; i++) {
			System.out.println("Enter Book Name");
			String name = sc.next();
			System.out.println("Enter Book Author");
			String author = sc.next();
			System.out.println("Enter Book Price");
			int price = sc.nextInt();
			System.out.println("Enter Number of Pages in book");
			int num_pages = sc.nextInt(); 
			bookArr[i] = new Book(name, author, price, num_pages);
		}
		System.out.println("The stored books are");
		for(int i = 0; i < n; i++) {
			System.out.println(bookArr[i]);
		}

	}
}
