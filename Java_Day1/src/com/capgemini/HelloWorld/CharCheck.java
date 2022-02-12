package com.capgemini.HelloWorld;

import java.util.Scanner;

public class CharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
	}
}
