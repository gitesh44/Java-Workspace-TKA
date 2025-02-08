package Conditional;

public class OddNumbers {
	
	OddNumbers(){
		OddCount();
		
	}
	
	public void OddCount() {
		int count=0;
		
		for(int num=12;num<=45;num++) {
			if(num % 2 !=0) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
