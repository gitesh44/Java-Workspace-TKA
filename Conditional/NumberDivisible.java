package Conditional;

public class NumberDivisible {
	
	
//    write a program to print number which 
//	 divisible by 3 and 5 from 451 to 541;
	NumberDivisible(){
		Divisible();
		
	}
	
	public void Divisible() {
		for(int num=451;num<=541;num++) {
			if(num%3 ==0 && num%5==0) {
				System.out.println(num);
			}
		}
	}

}
