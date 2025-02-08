package InheritanceEX2;
import java.util.Scanner;

//	- create a class Car	
//	- it is a sub class of Vehicle
//	- define a properties of Car  
//	- used encapsulation 
//	- define non-parameterized constructor 
//	- define a method to accept properties 
//	- define a method to show properties 



public class Car extends Vehicle {
	
	private int year;
	private String color;
	private String licensePlate;
	private double topSpeed;
	
	
	
	
    public Car(){
    	acceptValue();
    	Display();
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	Scanner sc=new Scanner(System.in);
	
	public void AcceptCar() {
		System.out.println("Enter the year of car manufactured ");
		setYear(sc.nextInt());
		 
		System.out.println("Enter the Color ");
		setColor(sc.next());
		
		System.out.println("Enter the license Plate ");
		setLicensePlate(sc.next());
		
		System.out.println("Enter the top Speed ");
		setTopSpeed(sc.nextInt());	
	}
	
	public void DisplayCar() {
		getYear();
		getColor() ;
		getLicensePlate();
		getTopSpeed() ;
	}

	
}
