package com.capgemini.arrayq;

// Write a program to sort the array
import java.util.Scanner;

public class SortArray {

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
		sc.close();
		int t;
		// Sort the array elements
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.print("Elements in the sorted array are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
