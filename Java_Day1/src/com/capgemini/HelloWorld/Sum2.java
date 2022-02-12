package com.capgemini.HelloWorld;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		sum = num1 + num2;
		System.out.println("Sum of given two numbers is: " + sum);
	}

}
