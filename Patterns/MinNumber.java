package Patterns;
import java.util.Scanner;

public class MinNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any 3 numbers--> ");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		
		int minimum=number1;
		if(number2<number1) {
			minimum=number2;
		}
		if(number3<number2) {
			minimum=number3;
		}
    System.out.println("the minimum number is- "+ minimum);		
	}

}
