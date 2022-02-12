package com.capgemini.HelloWorld;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
