package Patterns;

public class AlphaPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int k=1;k<=5;k++) {
			ch='A';
			for(int j=1;j<=k;j++) {
				System.out.print(ch++);
			}
			
			System.out.println();
		}
	}
}
