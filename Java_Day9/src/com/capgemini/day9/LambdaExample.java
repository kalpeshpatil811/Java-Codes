package com.capgemini.day9;

// Write a lambda take a to ASCII number from user and print the char
import java.util.Scanner;

@FunctionalInterface
interface ToChar {
	public char convert(int n);
}

public class LambdaExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		ToChar tc = n -> (char) n;
		System.out.println("Char is: " + tc.convert(num));
		sc.close();
	}
}
