package Methods;

import java.util.Scanner;

import Methods.EVENnumberMethod; 
public class MainPrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Input from user
        System.out.print("Enter a number to check if it's even or odd: ");
        int number = scanner.nextInt();

        // Call the isEven method from  and display the result
        if (EVENnumberMethod.isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

    }}
