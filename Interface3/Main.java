package Interface3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Car car = new Car("Toyota", "Camry", 50);
        Bike bike = new Bike("Honda", "Splender", 20);
        
        System.out.println("Car rent for 5 days--> " + car.calculateRent(5));
        System.out.println("Vehicle type: " + car.getVehicleType());
        
        System.out.println();
        
        System.out.println("Bike rent for 3 days-->" + bike.calculateRent(3));
        System.out.println("Vehicle type: " + bike.getVehicleType());

	}

}
