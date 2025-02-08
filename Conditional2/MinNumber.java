package Conditional2;

import java.util.Scanner;

public class MinNumber {
	 
		MinNumber(){
			acceptValue();
		}
		
		public void acceptValue() {
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a= ");
			a=sc.nextInt();
			System.out.println("Enter the value of b= ");
			b=sc.nextInt();
			System.out.println("Enter the value of c= ");
			c=sc.nextInt();
			
			Caluculations(a,b,c);
		
		}
		
		
		public void Caluculations(int a,int b, int c) {
			int min=a;
			if(b<c) {
				min=b;
			}else {
				min=c;
			}
			System.out.println("the minimum value is "+ min);
		}
	}


