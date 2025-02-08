package Patterns;

public class ReverseTrainaglePattern {
	
                                                   /*
Output---->

*****  
****  
***  
**    
*                                                   */
	
	
	//R=5,C=5

	public static void main(String[] args) {  //Rows
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {     //Rows
			for(int j=i;j<=5;j++) {    
				System.out.print("* ");
			}
			System.out.println();
		}

		
	}

}

