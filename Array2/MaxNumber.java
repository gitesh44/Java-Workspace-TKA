package Array2;

import java.util.Scanner;



public class MaxNumber {
	Scanner sc=new Scanner(System.in);
	public void acceptData(int arr[]) {
		System.out.println("enter the numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
	}
	public void display(int arr[]) {
		System.out.println();
    	for(int i=0;i<arr.length;i++) {
			System.out.print (arr[i]+ " ");
		}
		
	}
	
	public void getmax(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		
	
	}
		System.out.println("\nmaximum---->"+ max);
}
	public void getmin(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		
	
	}
		System.out.println("minimum--->"+min);
}
	public void getsecMax(int arr[]) {
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
			
			if(arr[i]<arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
						
			}
			}
	}
		System.out.println("sec max is--> "+arr[1]);
		

	}
	
     public void getsecMin(int arr[]) {
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
			
			if(arr[i]>arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
						
			}
			}
		}
		System.out.println("sec min is--> "+arr[1]);
		
     }
}
