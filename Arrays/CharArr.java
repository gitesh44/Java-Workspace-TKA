package Arrays;

import java.util.Scanner;

public class CharArr {
    
    CharArr() {
        char arr[] = new char[4]; 
        acceptValue(arr);
        display(arr);
    }

    Scanner sc = new Scanner(System.in);

    public void acceptValue(char arr[]) {
        System.out.println("Enter the characters one by one:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);  
        }
    }

    public void display(char arr[]) {
        System.out.println("The characters are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
