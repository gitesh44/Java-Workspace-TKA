package Conditional;

public class NumDivisible {
//write a program to print number which 
//	divisible by 4 and 7 from 300 to 100;
	
	NumDivisible(){
		NumDivi();
	}
	

	public void NumDivi() {
		for(int num=300;num>=100;num--) {
			if(num%4==0 && num%7==0) {
				System.out.println(num);
			}
		}
	}
}
