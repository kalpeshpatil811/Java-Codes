package com.capgemini.arrayq;

// Write a program to print largest and smallest element from array
import java.util.Scanner;

public class LargestSmallestOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number elements for array: ");
		int num = sc.nextInt();
		int arr[] = new int[num];

		System.out.println("Enter " + num + " array elements:");

		// Taking input from user
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		// Finding largest and smallest element
		int largest = arr[0], smallest = arr[0];
		for (int i = 0; i < num; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		// Printing Largest and Smallest Element in an Array
		System.out.println("Largest element: " + largest + "\nSmallest element: " + smallest);

	}

}