package com.capgemini.day2;

public class ConcatenateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 100, 200, 300, 400, 500 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = len1 + len2;
		int[] arr3 = new int[len3];
		System.out.println("Length of an 3rd array :- " + arr3.length);

		// Concatenating Two Array:-
		for (int i = 0; i < len1; i++) {
			arr3[i] = arr1[i];
			arr3[i + len1] = arr2[i];
		}

		// Printing Concatenated ARRAY:-
		for (int i = 0; i < len3; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
