package Methods;
import java.util.Scanner;

public class PalindromeCheckk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number- ");
		int num=sc.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println(num + " The number is Palindrome");
		}else {
			System.out.println(num +" The number is not Palindrome");
		}
	}
		
		
	public static boolean isPalindrome(int num) {       // Method to check if a number is a palindrome
		int org=num;
		int reversed=0;
		
		while(num>0) {
		 reversed= reversed*10 + num % 10;	  // Reverse the number and Extract the last digit of the number using the modulus operator (num % 10).
		 num=num/10; // Remove the last digit
		}
	 return org==reversed;  // Compare original and reversed numbers

}
}


 