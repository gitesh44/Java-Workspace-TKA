package Conditional;

public class SumOfDigits {
	
	SumOfDigits(){
		Sum();
		
	}

	
//	write a program to print sum 
//	of number from 22 to 55;	
	public void Sum() {
		int sum=0;
		for(int num=22;num<=55;num++) {
			sum=num+sum;
		}
		System.out.println(sum);
	}

}
