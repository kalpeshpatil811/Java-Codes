package com.capgemini.day9;

// Create Lambda for Find Given Number is positive or Negative

// Create Lambda to return square of given number
// Create Lambda to pass String and return in Upper case
// Create Lambda to pass string and return the length of String

@FunctionalInterface
interface PositiveOrNegative {
	public void find(int num);
}

@FunctionalInterface
interface NumSquare {
	public int findSqr(int num);
}

@FunctionalInterface
interface StringUpper {
	public String convert(String str);
}

@FunctionalInterface
interface StringLength {
	public int findLenth(String str);
}

public class LambdaExamples {

	public static void main(String[] args) {
		PositiveOrNegative postiveOrNegative = num -> {
			if (num > 0)
				System.out.println("Positive Number");
			else
				System.out.println("Negative Number");
		};

		postiveOrNegative.find(10);

		// skip the return keyword also
		NumSquare numberSQUR = num -> num * num;

		System.out.println(numberSQUR.findSqr(10));

		StringUpper strUpper = str -> str.toUpperCase();
		System.out.println(strUpper.convert("kalpesh"));

		StringLength length = str -> str.length();
		System.out.println(length.findLenth("kalpesh"));
	}
}
