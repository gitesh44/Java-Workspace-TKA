package Conditional;

public class Cube {
	
	
	public Cube() { //Constructor
		CubeNum();
		
	}
//write a program to cube of number from 51 to 21;	
	public void CubeNum() {
		int cb;
		for(int num=51;num>=21;num--) {
			cb=num*num*num;
			System.out.println(cb);
		}
	}
	

}
