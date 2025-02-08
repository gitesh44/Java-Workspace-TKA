package InheritanceEX3;

import java.util.Scanner;
//- create a class Bike	
//- it is a sub class of Vehicle
//- define a properties of Bike  
//- used encapsulation 
//- define non-parameterized constructor 
//- define a method to accept properties 
//- define a method to show properties 

public class Bike {
	private String make;          
    private String model;         
    private int year;             
    private double topSpeed;      
    private int engineCapacity; 
    
    public Bike() {
    	AcceptBike();
    	Display();
    	
    	
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	Scanner sc=new Scanner(System.in);
	public void AcceptBike() {
		System.out.println("Enter the make --->" );
		setMake(sc.next());
		
		System.out.println("Enter the model-->");
		setModel(sc.next());
		
		System.out.println("Enter the year-->");
		setYear(sc.nextInt());
		
		System.out.println("Enter the Top Speed--->");
		setTopSpeed(sc.nextDouble());
		
		System.out.println("Enter the Capapcity of Engine");
		setEngineCapacity(sc.nextInt());
	
	}
	 
	public void Display() {
		System.out.println("Bike Details:");
	    System.out.println("Make: " + getMake());
	    System.out.println("Model: " + getModel());
	    System.out.println("Year: " + getYear());
	    System.out.println("Top Speed: " + getTopSpeed() + " km/h");
	    System.out.println("Engine Capacity: " + getEngineCapacity() + " cc");

	}
    
}
