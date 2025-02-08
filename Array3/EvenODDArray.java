package Array3;
import java.util.Scanner;
public class EvenODDArray {
	EvenODDArray(){
		int arr[]=new int[5];
		Accept(arr);
//		DisplayEven(arr);
//		DisplayOdd(arr);
//		EvenSum(arr);
		//acceptPrime(arr);
		//Display(arr);
		PrimeNumber(arr);
	//	sumArray(arr);
		sumArrayPrime(arr); 
	}
	Scanner sc=new Scanner(System.in);
	
	public void Accept(int arr[]) {
		System.out.println("Enter the numbers--> ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
	}
	
	public void DisplayEven(int arr[]) {
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("the Even Elemenst are--> "+arr[i]);
			}
			
		}
		
	}
	public void DisplayOdd(int arr[]) {
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println("the odd Elemenst are--> "+arr[i]);
			}
			
		}
		
	}
	//To take number from user and stored in array to display sum of even number
	public void EvenSum(int arr[]) {
		System.out.println();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
				
			}
		}
		System.out.println(sum);
	}
	
	//To Display Prime Numbers.
	public void prime(int arr[]){
		System.err.println("the Prime number--> ");
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println("the Prime are-->"+arr[i]);
			}
			
			
		}
		
		
		
	}
	public void acceptPrime(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int num=sc.nextInt();
		if(isPrime(num)) {
			arr[i]=num;
		}
		else {
			i--;
		}
		}
	}
	public void Display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		System.out.println("the Prime are --> "+arr[i]);
		}
	}
	public boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
		
	}
	
	//In array Store only Prime number
	public void PrimeNumber(int arr[]) {
		System.out.println("The elememnts in array--> ");
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
	public void MaxNum(int arr[]) {
		System.out.println();
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			
	}
	}
	
//	wap which takes number from user and stored in array .display the pairs from array whose sum=5
//	eg:a[2]+a[4]=2+3=5
	
	
	public void sumArray(int arr[]) {
		System.out.println();

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=arr[j]+arr[i];
				if(sum==5) {
					System.out.println("the element is "+arr[i]+"and "+arr[j]);
				}
			}
		}
		
	}
	
//	wap which takes number from user and stored in array .display the pairs from array whose sum is prime
//	eg:a[2]+a[4]=2+3=5
	
	public void sumArrayPrime(int arr[]) {
		System.out.println();

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=arr[j]+arr[i];
				if(isPrime(sum)) {
					System.out.println("the element is "+arr[i]+"and "+arr[j]);
				}
			}
		}
		
	}
	
	
	
	

}
