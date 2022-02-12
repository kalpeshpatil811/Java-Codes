package com.capgemini.day5;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer a = 17;
		Integer b = 45;

		System.out.println("Min value: " + Integer.min(a, b));
		System.out.println("Max value: " + Integer.max(a, b));

		String c = "30";
		System.out.println("Integer value of c is: " + Integer.parseInt(c));

		System.out.println("Hash Code: " + a.hashCode());
		System.out.println("Bianry value: " + Integer.toBinaryString(a));
		System.out.println("Bit count: " + Integer.bitCount(a)); // Count of bits(No. of 1 in binary repre.)
	}
}
