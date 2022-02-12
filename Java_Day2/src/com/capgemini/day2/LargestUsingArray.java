package com.capgemini.day2;

public class LargestUsingArray {

	public static void main(String[] args) {
		int arr[] = { 10, 100, 150, 40, 50, 60 };
		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println("Largest element in the array is: " + large);
	}

}
