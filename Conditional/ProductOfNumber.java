package Conditional;

public class ProductOfNumber {
//	 write a program to print 
//	 product of number from 11 to 33;
	ProductOfNumber(){
		Numbers();
	}
	public void Numbers() {
		int product=1;
		for(int num=11;num<=33;num++) {
			product=product*num;
			
	
		}
		System.out.println(product);
		
	}
}
