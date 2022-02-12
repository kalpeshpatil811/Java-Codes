package com.capgemini.HelloWorld;

import java.util.Scanner;

public class GreaterIn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		if (a > b && a > c) {
			System.out.println("Largest number is: " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest number is: " + b);
		} else {
			System.out.println("Largest number is: " + c);
		}
	}

}
