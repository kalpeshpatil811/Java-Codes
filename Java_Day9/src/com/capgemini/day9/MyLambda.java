package com.capgemini.day9;

// Lambda: Which force us to do the function programming
// Top to bottom approach 

// Java 1.8 features 
// Lambda
// Stream APi
// Date Time

// Functional interface- which contain only method
// @FunctionalInterface annotation

@FunctionalInterface
interface MyCode {
	public void print();
}

@FunctionalInterface
interface MySum {
	public void sum(int a, int b);
}

@FunctionalInterface
interface EvenOrODD {
	public String findValue(int a);
}

public class MyLambda {

	public static void main(String args[]) {

		// Storing the value into variable
		int a = 10;
		System.out.println(a);

		// Java 8 allow use to store the code (function )inside java variable
		// Pass the function or method to java code
		// Type is not allowed because it is going to store in variable(Access Modifier)
		// Remove return type because whatever value you return i will understand
		// Method name -add lambda with method name ->
		// Remove the method name because we are not calling variable name
		// If you have lambda on right side you must have interface
		// Java says if one line code is there you can remove opening and closing
		// bracket
		// With code variable you will able to run it
		MyCode code = () -> System.out.println("My Method");
		// Execute the code late
		code.print();

		MySum sum = (x, z) -> {

			int c = x + z;
			System.out.println(c);
		};
		sum.sum(10, 20);

		System.out.println(evenOrOddValue(10)); // This is static method of the class

		// Will find the whether number id even or odd
		// Interface
		// Functional interface
		// Function parameters you can also ignore
		EvenOrODD evenorOdd = number -> {
			if (number % 2 == 0) {
				return "Even " + number;
			} else {
				return "Odd " + number;
			}
		};

		String str = evenorOdd.findValue(11);
		System.out.println(str);
	}

	public static String evenOrOddValue(int a) {
		if (a % 2 == 0) {
			return "Even " + a;
		} else {
			return "ODd " + a;
		}
	}
}