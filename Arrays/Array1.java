package Arrays;
import java.util.Scanner;

public class Array1 {
	
	Array1()
	{
		int[] y = new int[5];
		acceptvalue(y);
		DisplayValue(y);
		
	}
	public void acceptvalue(int y[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number- ");
		for(int k=0;k<=y.length;k++) {
			y[k]=sc.nextInt();
		}
		
	}
	public void DisplayValue(int y[]) {
		System.out.println("Value form array is ");
		for (int k = 0; k < y.length; k++) { 
			System.out.println(y[k]);
		}
	}

}
