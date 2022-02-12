package com.capgemini.stringq;

// Write a program to count the number of given char in string
import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();

		System.out.print("Enter the char you want to count: ");
		char ch = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Count of '" + ch + "' is: " + count);
		sc.close();
	}
}
