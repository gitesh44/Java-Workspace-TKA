package MultiDimensionalArray;
import java.util.Scanner;
public class Basic2D {
	
	
	public void acceptvalue(int arr[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr[i].length;j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
			
		
		}
		public void display(int arr[][]) {
			System.out.print("the elements are--> ");
	    	for(int i=0;i<arr.length;i++) {
	    		for(int j=0;i<arr[i].length;j++) 
				System.out.println ("\n "+ arr[i][j]+ " ");
			}
	    	System.out.println();
	    	
			
		
}
	

}
