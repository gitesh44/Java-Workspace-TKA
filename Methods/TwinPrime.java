package Methods;
import java.util.Scanner;


public class TwinPrime {
	
	
	Scanner sc=new Scanner(System.in);
	public int num;
	
	public void Accept() {
		System.out.println("enter the num--->");
	   int num=sc.nextInt();
		
	}
	
	public void Display() {
		System.out.println("Is " + num + " prime? " + isPrime(num));
        System.out.println("Twin prime pairs:");
        TwinPrime();

		
	}
	
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
	
	
	public void TwinPrime() {
		for(int i=2;i<100;i++) {
			if(isPrime(i) && isPrime(i+2) ) {
				System.out.println("( "+i+","+(i+2)+")");
			}
		}
	}

}
