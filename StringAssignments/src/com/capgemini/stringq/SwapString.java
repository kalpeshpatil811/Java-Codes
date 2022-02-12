package com.capgemini.stringq;

// Write a program to swap strings without using third variable
public class SwapString {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello Java";

		System.out.println("Value of str1 before: " + str1);
		System.out.println("Value of str2 before: " + str2);

		str1 = str1.concat(str2);
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());

		System.out.println("Value of str1 after: " + str1);
		System.out.println("Value of str2 after: " + str2);
	}
}
