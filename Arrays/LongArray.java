package Arrays;
import java.util.Scanner;

public class LongArray {
	
	LongArray(){
		 long[] arr = new long[5];
		acceptvalue(arr);
		Display(arr);
		
	}
	
	
	public void acceptvalue(long arr[]) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Numbers: ");
	        for (int i = 0; i < arr.length; i++) { 
	            arr[i] = sc.nextLong();
		}
	
		
	}
	
	
	public void Display(long arr[]) {
		System.out.println("The elements are: ");
        for (int i = 0; i < arr.length; i++) { 
            System.out.println(arr[i] + " ");
		}
		
	}

}
