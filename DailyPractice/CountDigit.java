package DailyPractice;

//write a program - write a method 
//to count the digit of number 

//count the digit of number.
import java.util.Scanner;

public class CountDigit {
	
	public CountDigit() {
		acceptValue();
		
	}

	public void acceptValue(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number-:  ");
		int num=sc.nextInt();
		
		Calculations(num);
	
	}
	
	
	public void Calculations(int num1) {
		//int num;
		int count=0;
		int temp = num1;
		while (temp > 0) {
		    temp = temp / 10;
		    count++;
		}

		
		System.out.println(count);
		}
		
	}
	
