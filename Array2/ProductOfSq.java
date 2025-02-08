package Array2;
import java.util.Scanner;


public class ProductOfSq {
//write a method to return product 
//	of square of even elements of array 
	ProductOfSq(){
		int arr[]=new int[5];
		acceptValue(arr);
		display(arr);
		evennumber(arr);
		
	}
	Scanner sc=new Scanner(System.in);
	
	public void acceptValue(int arr[]) {
		System.out.println("Enter the elements--> ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			
	}
	
	
    public void display(int arr[]) {
    	System.out.print("the elements are -->");
    	for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");;
		}
		
		
	}

    public void evennumber(int arr[]) {
    	int product=1;
    	for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				int square=arr[i]*arr[i];
				System.out.println(arr[i]+" --> "+square);
				product=square*product;
			}
		}
    	System.out.println("\n the product is--> "+ product);
	
	
}


}
