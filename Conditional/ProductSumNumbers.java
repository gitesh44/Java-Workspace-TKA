package Conditional;

public class ProductSumNumbers {
//	 write a program to print sum 
//	 of odd number from 112 to 332;
	
	public ProductSumNumbers() {
		ProductNumber();
	}
	
	public void ProductNumber() {
		int sum=0;
		for(int num=112;num<=332;num++) {
			if(num%2!= 0) {
				sum=sum+num;
			
			}
			
		}
		System.out.println(sum);
	}


}
