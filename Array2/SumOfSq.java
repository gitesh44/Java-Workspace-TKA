package Array2;
import java.util.Scanner;
public class SumOfSq {
	SumOfSq(){
		int arr[]=new int[5];
		acceptvalue(arr);
		display(arr);
		SumofSq(arr);
		SqofOdd(arr);
		ProductOfcube(arr);
		SumOfcubeOdd(arr);
		SumOfcubeEven(arr);
		

	}
	Scanner sc=new Scanner(System.in);
	
	public void acceptvalue(int arr[]) {
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
	
	public void display(int arr[]) {
		System.out.print("the elements are--> ");
    	for(int i=0;i<arr.length;i++) {
			System.out.println ("\n "+ arr[i]);
		}
		
	}
	
// write a method to return 
//sum of square of even elements of array 
	public void SumofSq(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				int square=arr[i]*arr[i];
				sum=sum+square;
			}
		}
		
		System.out.println("the sumof all even number are " + sum);
		
		
	}
	
//write a method to return sum of 
//square of odd elements of array
	
	public void SqofOdd(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 !=0) {
				int square=arr[i]*arr[i];
				sum=sum+square;
			}
		}
		
		System.out.println("the sum of square of  all odd number are " + sum);
	}		
		
	
	
//write a method to 
//return product of cube of even elements of array
	public void ProductOfcube(int arr[]) {
		int Product =1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				int cube=arr[i]*arr[i]*arr[i];
				Product=Product+cube;
			}
		}
		
		System.out.println("the product of cube of all even numbers are " + Product);

}
	
//write a method to 
//return product of cube of odd elements of array 
	public void ProductOfcubeOdd(int arr[]) {
		int Product =1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 !=0) {
				int cube=arr[i]*arr[i]*arr[i];
				Product=Product+cube;
			}
		}
		
		System.out.println("the product of cube of all odd numbers are " + Product);
	
	
	
	}
//write a method to 
//return sum of cube of even elements of array 
	public void SumOfcubeEven(int arr[]) {
		int Sum =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				int cube=arr[i]*arr[i]*arr[i];
				Sum=Sum+cube;
			}
		}
		
		System.out.println("the sum of the cube of all even numbers are " + Sum);
	
	
}
// write a method to 
//return sum of cube of odd elements of array 
	public void SumOfcubeOdd(int arr[]) {
		int Sum =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 !=0) {
				int cube=arr[i]*arr[i]*arr[i];
				Sum=Sum+cube;
			}
		}
		
		System.out.println("the sum of the cube of all odd numbers are " + Sum);
}
}
