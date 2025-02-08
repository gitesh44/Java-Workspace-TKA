package InheritanceEX2;
import java.util.Scanner;

//	 create a class Vehicle
//		- define a properties of Vehicle  
//		- used encapsulation 
//		- define non-parameterized constructor 
//		- define a method to accept properties 
//		- define a method to show properties 
public class Vehicle {
	
	private String model;
	private String color;             
	private String vehicleType;
	private String vin; //Vehicle Identification Number
	
	
	public Vehicle(){
		
	}
	
	public void setModel(String m) {
		this.model=m;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String color) {
		this.color=color;
		
	}
	
	public String getColor() {
		return color;
		
	}
	
	public void setVehicleType(String vt) {
		this.vehicleType=vt;
	}
	public String getVehicleType() {
		return vehicleType;

	}
	public void setVin(String Vin) {
		this.vin=Vin;
	}
	
	public String getVin() {
		return vin;
	}
	
	Scanner sc=new Scanner(System.in);

	public void acceptValue() {
		
		
		System.out.println("Enter the Vehicle");
		setModel(sc.next());	
		
		System.out.println("Enter the Color");
		 setColor(sc.next());
		 
		System.out.println("Enter the Type of Vehicle ? ");
		setVehicleType(sc.next());
		
		System.out.println("Enter the Vehicle Identification Number ");
		setVin(sc.next());

	}
	
	public void Display() {
		getModel();
		getColor();
		getVehicleType();
		getVehicleType() ;
	}


}