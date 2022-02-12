package com.capgemini.day7;

import java.util.*;

public class MyList {

	public static void main(String args[]) {
		// Interface left //implemented class on right side
		// Array as implementation
		List<String> ls = new ArrayList<String>();

		// LinkedList as implementation
		List<String> ls1 = new LinkedList<String>();

		// FILO
		List<String> ls2 = new Stack<String>();

		// Array
		// Thread safe
		List<String> ls4 = new Vector<String>();
	}
}