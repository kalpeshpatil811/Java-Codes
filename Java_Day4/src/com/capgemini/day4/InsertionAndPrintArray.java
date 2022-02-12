package com.capgemini.day4;

import java.util.Scanner;

public class InsertionAndPrintArray {

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

		// Printing elements of array
		System.out.print("Elements in the array are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
