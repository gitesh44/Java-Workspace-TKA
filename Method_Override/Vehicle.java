package Method_Override;

public class Vehicle {
	public void drive() {
		System.out.println();
	}

}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a car");
	}
}
