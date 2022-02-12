package com.capgemini.stringq;

// Write a program to remove given char from the string
import java.util.Scanner;

public class RemoveCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		StringBuffer s = new StringBuffer(sc.nextLine());
		System.out.print("Enter character you want to remove from string: ");
		char c = sc.next().charAt(0);
		sc.close();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				s.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(s);
	}

}
