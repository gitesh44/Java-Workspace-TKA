package Conditional;

public class SumOFEven {
	SumOFEven(){
		Sum();
		
	}
//	write a program to print sum of 
//	even number from 221 to 551;
	public void Sum() {
		int sum=0;
		for(int num=221;num<=551;num++) {
			if(num%2==0) {
				sum=sum+num;
			}
		}
		System.out.println(sum);
				
	}

}
