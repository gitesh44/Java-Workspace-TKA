package Encapsulation;
import java.util.Scanner;


public class House {
	private String address;
	private int NumberofRooms;
	private double Area;
	private int price;
	
	private double persquaremeter;
	Scanner sc=new Scanner(System.in);
	
	
	public House() { //Constructor
		acceptValue();
		show();
	}
	
	public void setaddress(String a) {
		address=a;
	}
	
	public String getaddress() {
		return address;
	}
	
	
	
	
	public void setNumberofRooms(int n) {
		NumberofRooms=n;
	}
	
	public int getNumberofRooms() {
		return NumberofRooms;
		
	}
	
	
	
	public void setArea(double ar) {
		Area=ar;
	}
	public double getArea() {
		return Area;
		
	}
	
	public void setPermeterf(double psm) {
		persquaremeter=psm;
	}
	public double getPermeter() {
	   return persquaremeter;
	
	}
	
	public void acceptValue() {
		
		System.out.println("enter the address");
		setaddress(sc.next());
		System.out.println("enter the NoofRooms");
		setNumberofRooms(sc.nextInt());
		System.out.println("enter the Area ");
		setArea(sc.nextDouble());
		System.out.println("enter the Permeter Value- ");
		setPermeterf(sc.nextDouble());
	
	
	}
	
	public void show() {
		System.out.println("the address "+ getaddress());
		System.out.println("the Noofrooms "+getNumberofRooms());
		System.out.println("The Area is " + getArea());	
		System.out.println("your price is "+ (getArea() * getPermeter()));
		
	}
	
	

	

}
