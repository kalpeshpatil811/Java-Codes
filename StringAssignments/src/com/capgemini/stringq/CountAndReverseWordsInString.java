package com.capgemini.stringq;

// Write the program to count the words in the string and reverse the words in the string
import java.util.Scanner;

public class CountAndReverseWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String rs = new String();
		int j = s.length();
		int c = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (i == 0) {
				rs = rs.concat(s.substring(i, j)); // From 0th index to j th(space index) index
				c++;
			}
			if (s.charAt(i) == ' ') {
				rs = rs.concat(s.substring(i + 1, j)); // From i th (prev space index) to j th (before space index)
				rs = rs.concat(" ");
				j = i;
				c++;
			}
		}

		System.out.println("Number of words in the string is: " + c);
		System.out.println("Words in the reverse order of string are:");
		System.out.println(rs);
	}
}
