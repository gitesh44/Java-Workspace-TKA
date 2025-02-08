package Constructor;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int fact=1;
		System.out.println("Enter the factorial number-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial is = " + fact);
	}

}
