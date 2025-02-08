package InheritanceEX04;
import java.util.Scanner;

//Problem Statement:
//Design a program for a library management system. Create the following classes:
//Book (base class): Contains attributes like title, author, ISBN, and price.
//EBook (derived class): Inherits Book and adds attributes like fileSize, downloadLink,
//and format (e.g., PDF, EPUB). 
//Add a method to display eBook details 
//and calculate the download cost for members (overload with parameters like membership type).

public class Book {
	private String title,author;
	private int price;
	private long ISBN;
	
	
	Book(){
		acceptDetails();
		
		
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	Scanner sc=new Scanner(System.in);
	public void acceptDetails() {
		System.out.println("enter the Title of Book-->");
		setTitle(sc.next());
		
		System.out.println("Enter the author of Book-->");
		setAuthor(sc.next());
		
		System.out.println("Enter ISBN of Book-->");
		setISBN(sc.nextInt());
		
		System.out.println("Enter the Purchased Price-->");
		setPrice(sc.nextInt());
		
		
	}

	
	
}
