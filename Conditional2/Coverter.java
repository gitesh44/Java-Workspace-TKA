package Conditional2;
import java.util.Scanner;

public class Coverter {
	
	Coverter(){
		acceptValue();
		
		
	}
	   
	public void acceptValue() {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("how many numbers you want to enter= ");
		
		int store=sc.nextInt();
		for(int i=0;i<store;i++) {
			System.out.println("enter the  number= ");
			num=sc.nextInt();
			
			Calculations(num);
		}
		
	}
	
	
	public void Calculations(int num) {
		
		
		while(num>0) {
		if(num%5==0) {
			System.out.println(num);
		}
		else {
			int ans=num%5;
			num=num-ans;
			System.out.println(num);
		}
		break;
	}
		}

}
