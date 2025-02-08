package Patterns;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your any 3 numbers- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int maximum=a;
		if(b>maximum) {
			maximum=b;
		}
		if(c>b){
			maximum=c;
		}
		
		
		System.out.println("we larger value among the 3 numbers---> " +maximum);
		
		
		

	}

}
