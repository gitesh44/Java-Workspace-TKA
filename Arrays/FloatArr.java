package Arrays;

import java.util.Scanner;

public class FloatArr {
	FloatArr(){
		Float arr[]=new Float[5];
		acceptvalue( arr);
		Display(arr);		
		
	}
	
	Scanner sc=new Scanner(System.in);
	
	public void acceptvalue(Float arr[]) {
		System.out.println("Enter the number---> ");
		for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextFloat();
		}
		
	}
	
	public void Display(Float arr[]) {
		System.out.println("The values are--> ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
	}

}
