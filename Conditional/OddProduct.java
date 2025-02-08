package Conditional;

public class OddProduct {
//	write a program to print product of
//	odd number from 11 to -33;
	
	OddProduct(){
		OddProductt();
			
		}
	
		
		public void OddProductt() {
			int product=1;
			for(int num=11;num>=-33;num--) {
				if(num%2!=0) {
					
					product=num*product;
				}
			}
		

			System.out.println(product);
	}

}
