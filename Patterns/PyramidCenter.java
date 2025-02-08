package Patterns;


//Space is one of the Character.

public class PyramidCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=5;
		for(int i=1;i<=5;i++) {
			for(int m=1;m<=(sp-i);m++) {
				System.out.print("  "); //sirf space kam kiyaa as same as Space Pyramid
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}

