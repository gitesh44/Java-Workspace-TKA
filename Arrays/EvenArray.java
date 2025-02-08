package Arrays;

import java.util.Scanner;

public class EvenArray {
	EvenArray()
	{
		int[] y = new int[5];
		acceptvalue(y);
		//DisplayValue(y);
		Calcu(y);
		
	}
	
	public void Calcu(int y[]) {
		System.out.println("Enter the numbers : ");
			for(int k=0;k<y.length;k++) {
				if(y[k] % 2==0) {
					System.out.println(y[k]);
				}
			}
		
		
	}
	public void acceptvalue(int y[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number- ");
		for(int k=0;k<=y.length;k++) {
			y[k]=sc.nextInt();
		}
		
	}
//	public void DisplayValue(int y[]) {
//		System.out.println("Value form array is ");
//		for (int k = 0; k < y.length; k++) { 
//			System.out.println(y[k]);
//		}
	}



