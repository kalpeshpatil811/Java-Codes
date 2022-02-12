package com.capgemini.arrayq;

// Write a program to find sum and average of all elements in the array
import java.util.Scanner;

public class SumAndAverageOfArray {

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

		// Finding sum of all numbers in array
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all numbers in the array is: " + sum);

		// Finding average
		double average = (double) sum / n;
		System.out.println("Average of all numbers in the array is: " + average);
	}
}
