package Arrays;
import java.util.Scanner;
public class ArrOddSum {
//write a method to return cube of odd elements of array 
	ArrOddSum(){
		int arr[]=new int[5];
		acceptvalue(arr);
		Displayvalue(arr);
		Cubevalue(arr);
		
		
	}
	
	Scanner sc=new Scanner(System.in);
	
	public void acceptvalue(int arr[]) {
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	
	}
	
   public void Displayvalue(int arr[]) {
	   System.out.println("the elements are--> ");
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
		
	}
   
 
   
    public void Cubevalue(int arr[]) {
    	int cube=1;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]%2 !=0) {
    			cube=arr[i]*arr[i]*arr[i];
    			System.out.println("the cube of a elements are--> " + cube);
    		}
    		
    	}
	
   }

    
}
