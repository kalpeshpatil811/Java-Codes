package com.capgemini.day5;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		// New string value
		// Only str.concat(" Java") will not change the value of str
		// We have to store the return value
		// Also it is not modifying the value of String but it is replacing it with new
		// string
		String str = "Hello";
		str = str.concat(" Java"); // Returning a new string
		System.out.println(str);

		// StringBuffer used with new keyword
		// Cannot used as data type
		// Not Thread safe(Any number of thread can use this method)
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" Java"); // Here the value of StringBuffer is modified
		System.out.println(sbf);
		// Delete in string buffer
		sbf.delete(2, 5);
		System.out.println(sbf);

		// Thread safe(Only One Thread can use this at a time)
		StringBuilder sb = new StringBuilder("Hello, Java");
		System.out.println(sb);
		sb.append("!"); // Value of StringBuilder is modified
		System.out.println(sb);
	}
}