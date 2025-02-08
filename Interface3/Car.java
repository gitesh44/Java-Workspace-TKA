package Interface3;

public class Car implements Vehicle{
	private String brand;
	private String model;
	private int dailyRent;
	private int days;
	
	
	Car(String brand,String model,int dailyRent){
		this.brand=brand;
		this.model=model;
		this.dailyRent=dailyRent;
	}
	
	
	@Override
	public double calculateRent(int day) {
		return day * dailyRent;
		
		
	}

	@Override
	public String getVehicleType() {
		return "Car";
	}
	

}
