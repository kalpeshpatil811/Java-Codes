package com.capgemini.day2;

public class AverageUsingArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 33, 45, 2, 37, 48, 59 };
		float sum = 0f;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			sum = sum + arr[i];
		}
		float avg = sum / len;
		System.out.println("Average of the elements in given array is: " + avg);
	}

}
