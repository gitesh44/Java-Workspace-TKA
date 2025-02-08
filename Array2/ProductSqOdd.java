package Array2;
import java.util.Scanner;

//write a method to return product 
//of square of odd elements of array 
public class ProductSqOdd {
	ProductSqOdd(){
		int arr[]=new int[5];
		acceptvalue(arr);
		Display(arr);
		ProductOdd(arr);
		
		
	}
	
	Scanner sc=new Scanner(System.in);
	public void acceptvalue(int arr[]) {
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
	
    public void Display(int arr[]) {
    	System.out.print("the elements are--> ");
    	for(int i=0;i<arr.length;i++) {
			System.out.println ("\n "+ arr[i]);
		}
		
	}
  //write a method to return product 
  //of square of odd elements of array 


    public void ProductOdd(int arr[]) {
    	int product=1;
    	
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]%2 !=0) {
    			int square=arr[i] *arr[i];
    			System.out.println("Square of an odd number " + arr[i] + " is "+ square);
    			product =square*product;
    		}
 
    	}
    	System.out.println("The product is---> "+product);
    	
    	
	
    }


}
