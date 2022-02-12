package com.capgemini.day9;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface CombineStrings {
	public String combine(String s1, String s2);
}

@FunctionalInterface
interface FindK {
	public String[] find(String[] arr);
}

@FunctionalInterface
interface FibbSeries {
	public void print(int n);
}

@FunctionalInterface
interface ToAscii {
	public int convert(char c);
}

@FunctionalInterface
interface Min {
	public int min(int a, int b);
}

@FunctionalInterface
interface Max {
	public int max(int a, int b);
}

@FunctionalInterface
interface Sum {
	public int sum(int a, int b, int c);
}

@FunctionalInterface
interface Avg {
	public float avg(int a, int b, int c);
}

public class MoreLambdaExamples {

	public static void main(String[] args) {
		// Combine Strings
		CombineStrings str = (s1, s2) -> s1 + " " + s2;
		System.out.print("Combined String is: ");
		System.out.println(str.combine("Kalpesh", "Patil"));
		System.out.println();

		// Return string array with strings starting with 'A'
		FindK find = a -> {
			List<String> ls = new ArrayList<String>();
			for (int i = 0; i < a.length; i++) {
				if (a[i].charAt(0) == 'K') {
					ls.add(a[i]);
				}
			}
			String[] temp = new String[ls.size()];
			for (int i = 0; i < ls.size(); i++) {
				temp[i] = ls.get(i);
			}
			return temp;
		};
		String[] arr = { "Kalpesh", "Yash", "Shubham", "Jay" };
		String[] arrK = find.find(arr);
		System.out.println("Strings starting with K are:");
		for (String s : arrK) {
			System.out.println(s);
		}
		System.out.println();

		// Fibonacci Series
		FibbSeries fs = n -> {
			int a = 0, b = 1, c;
			if (n == 1) {
				System.out.println(a);
			}
			if (n == 2) {
				System.out.println(a + " " + b);
			}
			if (n >= 3) {
				System.out.print(a + " " + b);
				for (int i = 2; i <= n; i++) {
					c = a + b;
					System.out.print(" " + c);
					a = b;
					b = c;
				}
			}
		};
		System.out.println("Fibonacci Series:");
		fs.print(10);
		System.out.println("\n");

		// Convert to ASCII value
		ToAscii ta = c -> (int) c;
		System.out.println("ASCII value is: " + ta.convert('K'));
		System.out.println();

		// Min number
		Min min = (a, b) -> {
			if (a < b)
				return a;
			else
				return b;
		};
		System.out.println("Minimum number is: " + min.min(5, 3));
		System.out.println();

		// Max number
		Max max = (a, b) -> {
			if (a > b)
				return a;
			else
				return b;
		};
		System.out.println("Maximum number is: " + max.max(5, 3));
		System.out.println();

		// Sum of three numbers
		Sum sum = (a, b, c) -> a + b + c;
		System.out.println("Sum is: " + sum.sum(5, 10, 20));
		System.out.println();

		// Average of three numbers
		Avg avg = (a, b, c) -> (a + b + c) / 3f;
		System.out.println("Average is: " + avg.avg(3, 5, 2));
		System.out.println();
	}
}
