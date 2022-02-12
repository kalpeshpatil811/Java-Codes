package com.capgemini.day5;

/*Runtime Exception 
 * Checked Exception: Checked at compile time and throw a error
 * Unchecked Exception: Which is not checked at compile time
 * 
 * Exception: It is error in java
 * There are two type of error
 * Syntax error:It is identified by the compiler and code will not be compiled
 * There is no solutions, you have to correct it
 * Logical error: Logical error is called exception 
 * Each Exception have some name
 * Exception will break the flow of program
 * It can be wrong input/output
 * We can handle the exception using try catch block
 * We can take the input again 
 * Or we can show proper message to user
 * 
 * Exception Handling:
 * try
 * {
 * 		It will look for exception
 * }
 * catch()
 * {
 * 		catch will handle the exception
 * }
 * try and catch block needs to be used together*/

public class MyException {

	@SuppressWarnings("null")
	public static void main(String args[]) {

		try {

			// Checked Exception
			// Unhandled exception type FileNotFoundException
			// Compiler force to handle these Exception

			// FileInputStream inputStream=new FileInputStream("c:\\file.txt");

			// int a[] = new int[5];
			// ArrayIndexOutOfBoundsException
			// MyArray size of 5
			// I am trying to access the 7 location
			// a[7]=10;

			// Syntax error, insert ";" to complete BlockStatements
			// int a=10
			System.out.println("Hello first line");
			// Type mismatch: cannot convert from String to int
			// int a="hello";

			// No Syntax error is here
			// Exception Name: NullPointerException
			String str = null;
			System.out.println(str.substring(5));
			// Break the flow because of exception
			System.out.println("Hello Java");
		} catch (Exception e) {
			// It will print the exception name
			e.printStackTrace();
			// it will print the exception name
			System.out.println(e.getMessage());
			System.out.println("Error in str. Please give some value");
		}
	}

}
