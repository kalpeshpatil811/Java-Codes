package com.capgemini.day5;

public class MyString {

	public static void main(String[] args) {
		String str1 = " Hello, String! ";
		String str2 = new String();
		String str3 = new String(" Hello, String! ");

		System.out.println(str3.length());
		// it will check string contain some value or not
		// it will return true or false
		if (str2.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}

		// charAt --it return the character a given location
		System.out.println(str3.charAt(1));

		// codePointAt
		System.out.println(str3.codePointAt(1));

		// equals it is used to compare two String
		if (str1.equals(str3)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		// equalsIgnoreCase --true or false
		if (str1.equalsIgnoreCase(str3)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		// compareTo return integer value
		String str4 = "A"; // 65
		String str5 = "E"; // 69

		// 65 compare 69
		// differ -4

		// 68 compare 65
		// differ 3

		// 65 compare 65
		// differ 0

		// if first is small or lower than second it return the difference with minus
		// if first one is bigger than second it return the difference with positive
		// if first and second are equal then it return the 0
		System.out.println(str4.compareTo(str5));

		// compareToIgnoreCase
		// it will not consider the case
		System.out.println(str4.compareToIgnoreCase(str5));

		// startsWith
		// it is used to check string is start with particular value
		System.out.println(str1.startsWith("H"));

		// substring it is used to get the substring value

		// Hello World

		// method overloading concept
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 5));
		// System.out.println(str.substring());

		System.out.println(str1.concat(" H"));

		System.out.println(str1.concat(" " + str3));

		// contains it will search for match string and return or false
		System.out.println(str1.contains("llo"));
		System.out.println(str1.contains("Java"));

		// toLowerCase
		System.out.println(str1.toLowerCase());

		// toUpperCase
		System.out.println(str1.toUpperCase());

		// trim remove the space
		System.out.println(str1.trim());

		String str6 = "Java";
		String str7 = "Java";
		String str8 = new String("Java");
		System.out.println(str6.hashCode());
		System.out.println(str7.hashCode());
		// System.out.println(str8.hashCode());
		// address and value
		if (str6 == str8) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
