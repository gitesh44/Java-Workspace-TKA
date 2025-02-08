package Interface;

public class PhonePay implements Payment{
	private long Phonenumber;
	private int amount;
	public PhonePay(long Phonenumber) {
		this.Phonenumber=Phonenumber;
		System.out.println("The Credit number is--> "+Phonenumber);
	}
	@Override
	public void MakePayment(int amount) {
		System.out.println("Amount is" +amount);
		
		
	}
	@Override
	public void refund(int amount) {
		System.out.println("refund is" + amount);
		
		
	}
	
	

}
