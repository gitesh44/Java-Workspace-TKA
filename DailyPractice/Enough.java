package DailyPractice;
import java.util.Scanner;

public class Enough {
//	Write a function named "enough" that takes one integer argument, call it "goal" and returns as its
//	value the smallest positive integer n for which 1+2+3+. . . +n is at least equal to goal . Thus, for
//	example,
//	System.out.println(enough(9)); // will print  4  because  1+2+3+4 ≥ 9  
//	                               // but 1+2+3<9
//	System.out.println(enough(21));// will print  6  because 1+2+ ...+6 ≥ 21  
//	                               // but 1+2+ . . . 5<21
//	System.out.println(enough(-7));// will print  1  because  1 ≥ -7 and 1 is  
//	                               // the smallest positive integer
//	System.out.println(enough(1)); // will print  1  because  1 ≥ 1 and 1 is  
//	                               // the smallest positive integer
	
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter the  Number ----> ");
		int n=sc.nextInt();
		
		System.out.println(enough(n));
	}
	
	public static int enough(int goal) {
		int sum=0;
		int n=0;
		
		while(sum<goal) {
			n++;
			sum=sum+n;
		}
		return n;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enough e1=new Enough();
		e1.accept();
		
		

	}

}
