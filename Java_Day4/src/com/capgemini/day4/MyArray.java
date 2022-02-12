package com.capgemini.day4;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		// Inserting elements in array
		System.out.println("Enter five array elements: ");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		sc.close();
		// Printing elements of array
		System.out.println("Elements in array are: ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
