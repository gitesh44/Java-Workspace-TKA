package Arrays;

import java.util.Scanner;

public class ByteArray {
	ByteArray()
	{
		byte[] y = new byte[5];
		acceptvalue(y);
		DisplayValue(y);
		
	}
	public void acceptvalue(byte y[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number- ");
		for(int k=0;k<y.length;k++) {
			y[k]=sc.nextByte();
		}
		
	}
	public void DisplayValue(byte y[]) {
		System.out.println("Value form array is ");
		for (int k = 0; k < y.length; k++) { 
			System.out.println(y[k]);
		}
	}

}


