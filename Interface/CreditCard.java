package Interface;

public class CreditCard implements Payment{
	private long cardNumber;
	private int amount;
	
	public CreditCard(long cardNumber) {
		this.cardNumber=cardNumber;
		System.out.println("The Credit number is--> "+cardNumber);
	}
	
	@Override
	public void MakePayment(int amount) {
		System.out.println("Amount is" + amount);
		
	}
	
	@Override
	public void refund(int amount) {
		System.out.println("refund is " + amount);
		
	}
	
	
	
	
	
	
	

}
