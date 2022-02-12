package com.capgemini.day6;

import java.util.Scanner;

//create a class
//extends Exception class

//throws  -- this is use throw the exception at method level
//throw   -- use the throw the user defined exception
class OnlyPostiveNumberAllowed extends Exception {
	public OnlyPostiveNumberAllowed() {
	}

	public OnlyPostiveNumberAllowed(String msg) {
		// Super keyword used to initialize the parent class constructor
		// Way to call parent class constructor
		super(msg);
	}

	@Override
	public String getMessage() {
		return "Enter positive number.";
	}
}

public class MyCustomException {

	// exception at method level
	// compiler is not catching this exception
	public static void main(String[] args) throws Exception {
		// Need to find the even and off from positive number
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();
		// OnlyPostiveNumberAllowed
		if (number > 0) {
			// even off logic will come
			System.out.println("Number is: " + number);
		} else {
			// System.out.println("Only Positive Number are allow");
			// to use throw keyword
			System.out.println(new OnlyPostiveNumberAllowed().getMessage());
			throw new OnlyPostiveNumberAllowed("Only Positive Number are allow");
		}
	}
}
