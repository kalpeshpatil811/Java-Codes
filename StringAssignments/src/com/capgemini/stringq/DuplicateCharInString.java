package com.capgemini.stringq;

// Write a program to print all duplicate characters from given string
import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		sc.close();
		char[] s = str.toCharArray();
		int c;
		System.out.println("Duplicate characters in the string are:");
		for (int i = 0; i < s.length; i++) {
			c = 1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j] && s[j] != ' ') {
					c++;
					s[j] = '0';
				}
			}
			if (c > 1 && s[i] != '0') {
				System.out.println(s[i]);
			}
		}
	}
}
