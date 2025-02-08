package Constructor;

public class ElectricityBill {

	int metercharge;
	int unitcharge;
	int Electricityused;
	
	public ElectricityBill(int units) {
		Electricityused=units;
		
	}
	
	public void calculate() {
		if(Electricityused<=100) {
			metercharge=150;
			unitcharge=100* Electricityused;
			
		}
		else if(Electricityused<=200) {
			metercharge=200;
			unitcharge=150*Electricityused;
		}
		else if(Electricityused<=300) {
			metercharge=250;
			unitcharge=200*Electricityused;
		}
		else {
			metercharge=300;
		}	
		
	}
	
	
	public void ShowBill() {
		
		System.out.println("Here is the electricty bill----->>>>  ");
		System.out.println("the meter charge >>>>  " + metercharge);
		System.out.println("the unit charge >>>>  " + unitcharge);
		System.out.println("the Total charge >>>>  " + (unitcharge + metercharge));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill B1=new ElectricityBill(50);
		B1.calculate();
		B1.ShowBill();

	}

}
