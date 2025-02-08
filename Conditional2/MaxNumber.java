package Conditional2;

import java.util.Scanner;

public class MaxNumber {
	
	
	MaxNumber(){
		acceptValue();
	}
//find the max number from 3 numbers
	public void acceptValue() {
		
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a= ");
		a=sc.nextInt();
		System.out.println("Enter the value of b= ");
		b=sc.nextInt();
		System.out.println("Enter the value of c= ");
		c=sc.nextInt();
		
		Calculation(a,b,c);
	
	}
	
	public void Calculation(int a,int b,int c) {
		int max=a;
		if(b>c) {
			max=b;
			
		}else {
			max=c;
		}
		
		System.out.println("Maximum number is"+max);
		
	}
	
}