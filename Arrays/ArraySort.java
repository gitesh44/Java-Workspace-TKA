package Arrays;

import java.util.Scanner;

public class ArraySort {
	ArraySort() {
		int arr[] = new int[5];
		Acceptvalue(arr);
		display(arr);
	}

	public void Acceptvalue(int arr[]) {
		System.out.println("Enter the numbers--> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

	}

	public void display(int arr[]) {
		System.out.println("The elements sorted are --> ");
		Calculations(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	Scanner sc = new Scanner(System.in);

	public void Calculations(int arr[]) {

		// System.out.println("Enter the elements into an array---> ");
		for (int k = 0; k < arr.length; k++) {
			for (int j = k + 1; j < arr.length; j++) {
				if (arr[k] > arr[j]) {
					int t = arr[k];
					arr[k] = arr[j];
					arr[j] = t;

				}
			}

		}
	}

}
