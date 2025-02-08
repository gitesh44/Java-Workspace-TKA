package GiteshCode;
//1. write a program - write a method 
//to check number is prime or not 
import java.util.Scanner;

public class PrimeNum {
	
	
	PrimeNum(){
		acceptValue();
		
	}
	Scanner sc= new Scanner(System.in);
	public boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
		}
	}
		return true;
	
	}

	public void acceptValue() {
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		
		
		
		boolean b=isPrime(num);
		System.out.println(b);

		
	}
	


}
