package Methods;
import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number -");
		int num=sc.nextInt();
		
		System.out.println("Enter the power of number -");
		int power=sc.nextInt();
		
		printPower(num,power);
	}
	public static void printPower(int num,int power) { // Method to calculate and print the power of a number
		int result=1;
		
		for(int i=0;i<power;i++) {   // Calculate base^power using a loop
			result=result * num;
			
		}
		
		System.out.print("the result is" + result);
		
		
		
		

	}

}
