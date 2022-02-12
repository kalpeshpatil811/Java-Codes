package com.capgemini.HelloWorld;

import java.util.Scanner;

public class ComplexSum {
	double real, img;

	ComplexSum(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public static void main(String[] args) {
		ComplexSum n1 = new ComplexSum(0, 0);
		ComplexSum n2 = new ComplexSum(0, 0);
		ComplexSum sum = new ComplexSum(0, 0);

		Scanner sc = new Scanner(System.in);
		System.out.println("First number: ");
		n1.real = sc.nextDouble();
		n1.img = sc.nextDouble();
		System.out.println("Second number: ");
		n2.real = sc.nextDouble();
		n2.img = sc.nextDouble();
		sc.close();

		sum.real = n1.real + n2.real;
		sum.img = n1.img + n2.img;

		System.out.println("Sum of two complex numbers is: " + sum.real + "+" + sum.img + "i");
	}
}
