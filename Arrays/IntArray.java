package Arrays;
import java.util.Scanner;

public class IntArray {
	IntArray(){
		int arr[]=new int[6];
		acceptValue(arr);
		displayvalue(arr);
		
		
	}
	
	Scanner sc=new Scanner(System.in);
	public void acceptValue(int arr[]) {
		System.out.println("ENter the elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
	}
	
	public void displayvalue(int arr[]) {
		System.out.println("the elements are --->  ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "  ");
			
		}
		
	}
}
