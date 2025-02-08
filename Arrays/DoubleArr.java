package Arrays;

import java.util.Scanner;

public class DoubleArr {
	
	
      DoubleArr(){
		
		double arr[]=new double[4];
		acceptVaalue(arr);
		Display( arr);
		
		
	}
	
	
	Scanner sc=new Scanner(System.in);
	public void acceptVaalue(double arr[]) {
		System.out.println("Enter the number--> ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		
	
}
		
	
	public void Display(double arr[]) {
		System.out.println(" the number--> ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
			
	
	
	
	
		}
	}

}
