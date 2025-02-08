package Arrays;
import java.util.Scanner;

public class SumOfElements {
//	 write a method to return sum of even elements of array
	
	SumOfElements(){
		int arr[]=new int[4];
		accept(arr);
		display(arr);
		SumOfEven(arr);
		
	}
	
	
	Scanner sc=new Scanner(System.in);
	
	public void accept(int arr[]) {
		System.out.println("Enter the elements = ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
	}
	public void display(int arr[]) {
		System.out.print("the even elements are---> ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
			
		}
		
	}
	public void SumOfEven(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			sum=sum+arr[i];
		}
		
	}
		System.out.println(" \n the sum is --> " + sum);
	}
	
}
