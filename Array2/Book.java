package Array2;
import java.util.Scanner;
public class Book {
	private String name;
	private String author;
	private double price;
	private int quantity;
	private double total;
	
	
	public void Setdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the book");
		name=sc.nextLine();
		
		System.out.println("Enter the name of the author");
		author=sc.nextLine();
		
		System.out.println("Enter the price");
		price=sc.nextDouble();
		
		System.out.println("Enter the quantity");
		quantity=sc.nextInt();
		
		
	}
	
	public void GetData() {
		System.out.println("----------Details----------------");
		System.out.println("name --> " + name);
		System.out.println("author --> " +author);
		System.out.println("price --> " +price);
		System.out.println("quanity --> " +quantity);
		System.out.println("Total---> " + (total=price*quantity));
		
	
}
	
	public static void accept(Book arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Book();
			arr[i].Setdata();	
		
		
		}
}
	public static void show(Book arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].GetData();
		}
	}
		
	public static void Sort(Book arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].price>arr[j].price) {
				    Book temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		
	}
		
	}

