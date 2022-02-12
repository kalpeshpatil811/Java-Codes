package com.capgemini.stringq;

// Write a program to check if string is palindrome or not
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int j = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("Not Palindrome");
				return;
			}
			j--;
		}
		System.out.println("Palindrome");
		return;
	}
}
