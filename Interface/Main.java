package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1=new CreditCard(6356632);
		p1.MakePayment(500);
		p1.refund(500);
		
		Payment p2=new PhonePay(936524486);
		p2.MakePayment(8600);
		p2.refund(500);

	}

	
	
}
