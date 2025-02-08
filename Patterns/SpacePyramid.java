package Patterns;

public class SpacePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=5;
		for(int k=1;k<=5;k++) {
			for(int m=1;m<=(sp-k);m++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=k;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
