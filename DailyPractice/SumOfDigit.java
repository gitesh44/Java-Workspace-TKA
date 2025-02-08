package DailyPractice;
import java.util.Scanner;
public class SumOfDigit {
//	1. write a java program accept number from user and 
//	perform sum of digit of numbers until number comes 
//	single unit
//	e.g 
//	int y=4135;
//	int sum=4+1+3+5=13
//	sum=1+3=4
	
	
	
	
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter the Number for which you have to do sum--> ");
		int num=sc.nextInt();
		sumOfDigit(num);
	}
	
	public void sumOfDigit(int num) {
		int sum=0;
		
		for(int i=0;i<num;i++) {
			int temp=sum;
			sum=num%10;
			sum=sum+num;
			while(num>9) {
				sum=0;
				while(num>0)
					sum += num % 10;
				num=num/10;
				num=sum;
				
			}
			System.out.println(num);
			
		}
		 System.out.println("Final  sum: " + num);
		
	}
	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigit s1=new SumOfDigit();
		System.out.println();
		s1.accept();
		
		
		

	}

}
