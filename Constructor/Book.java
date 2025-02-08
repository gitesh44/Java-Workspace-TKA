package Constructor;
import java.util.Scanner;

public class Book {
	String Book_name;
	String Book_author;
	int Book_price;
	int Book_quantity;
	int total;
	
	public Book() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enther the name of the book"   );
		 String Book_name=sc.next();
		 Book_author="JNe emvrk";
		 Book_price=894;
		 Book_quantity=88;
		 total=900;
	}
	public void display() {
		System.out.println(Book_name);
		System.out.println(Book_author);
		System.out.println(Book_price);
		System.out.println(Book_quantity);
		System.out.println(total);
	}
	
	
public class Student{
	int Rollno;
	String name;
	String NameOfCollege;
	String Remark;
	String Address;
	
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enther the name of the Student"   );
		String name=sc.next();
	}
	
	public void display() {
		System.out.println(name);
		//System.out.println(Book_author);
	}
}
	

public static void main(String[] args) {
	Book b1=new Book();
	b1.display();
	
	
	
}
}
