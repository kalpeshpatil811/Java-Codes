package com.capgemini.arrayq;

// Write a program to delete an element from array
import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		// Taking the size of array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		// Inserting elements in array
		System.out.println("Enter " + n + " array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Deleting an element
		System.out.print("Enter element you want to delete: ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				n--;
			}
		}
		// Printing array
		System.out.print("Elements in the array are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
