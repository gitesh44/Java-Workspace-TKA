package DailyPractice;
import java.util.*;

public class Reversenumber {
//	write a program - write a method to 
//	reverse the number
	Reversenumber(){
		Acceptvalue();
		
	}
	Scanner sc=new Scanner(System.in);
	public void Acceptvalue() {
		System.out.println("Enter the number you want to reverse");
		int num=sc.nextInt();
		
		Calculations(num);
	}
	
	public void Calculations(int num) {
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		System.out.println(rev);
	}

}
