package Conditional;

public class ProductEven {
//	write a program to print product 
//	of even number from 22 to -11;

	ProductEven(){
		ProductEv();
	}
	
	
	
	public void ProductEv() {
		int product=1;
		for(int num=22;num>= -11;num--) {
			if(num%2==0) {
				product=product*num;
				
			}
		}
		System.out.println(product);
		
	}

}
