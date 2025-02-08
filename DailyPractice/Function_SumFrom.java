package DailyPractice;

import java.util.Scanner;

//Write a function named "sumFromTo" that takes two integer arguments, call them "first" and
//"last", and returns as its value the sum of all the integers between first and last inclusive. 
//Thus,for example,
//System.out.println(sumFromTo(4,7));  // prints  22  because 4+5+6+7 = 22  
//System.out.println(sumFromTo(-3,1)); // prints  -5  because  
//                                     // -3+(-2)+(-1)+0+1 = -5  
//System.out.println(sumFromTo(7,4));  // prints  22  because 7+6+5+4 = 22  
//System.out.println(sumFromTo(9,9));  // prints  9 

public class Function_SumFrom {
	
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter the First Number ----> ");
		int first=sc.nextInt();
		
		System.out.println("Enter the Last Number ----> ");
		int last=sc.nextInt();
		
		
		SumfromTo( first, last);
		
		
	}
	
	public void SumfromTo(int first,int last) {
		int sum=0;
		for(int i=first;i<=last;i++) {
			sum=i+sum;
		} 
		System.out.println("the sum is-->  "+ sum);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_SumFrom f1=new Function_SumFrom();
		
		f1.accept();

	}

}
