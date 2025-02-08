package Conditional;
import java.util.Scanner;


public class EvenNumbers {
	
	
	
	public EvenNumbers() {
		Even();
		
	}
	

	public void Even() {
		int count=0;
		
		for(int num=111;num<=200;num++) {
			if(num % 2==0) {
				count++;
		
		}
		}
		System.out.println("the count is "+ count);
		}
	}
