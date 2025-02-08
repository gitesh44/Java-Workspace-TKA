package Arrays;
import java.util.Scanner;


//write a method to print cube of each elements of array 
public class CubeArr {
	CubeArr(){
		int arr[]=new int[5];
		acceptvalue(arr);
		//Cube(arr);
		//square(arr);
		//even(arr);
		prime(arr);
		
	}
	Scanner sc=new Scanner(System.in);
	
	public void acceptvalue(int arr[]) {
		System.out.println("Enter the number --> ");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		
	}
	
	public void Cube(int arr[]) { //for Cube 
		int cube;
		for(int i=0;i<arr.length;i++) {
			cube=arr[i]*arr[i]*arr[i];
			System.out.println("the cube of number "+ arr[i] +" is " + cube);
		}
	
	}
	
	
	public void square(int arr[]) { //for Square
		int Square;
		for(int i=0;i<arr.length;i++) {
			Square= arr[i]*arr[i];
			System.out.println("The square of a number " + arr[i] + " is " + Square);
		}
		
		
	}
	
	
	public void even(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %2==0) {
				System.out.println(arr[i]);
				
			}
			
		}
	}
	public void odd(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]% 2!= 0) {
				System.out.println(arr[i]);
				
			}
			
		}
	}
	
	
	public  void prime(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
			System.out.println( (arr[i]));
			
		}
		}
	}
	
	public boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;
		
		
	}
	
	
	
	
	
}
