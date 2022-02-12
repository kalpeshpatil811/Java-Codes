package com.capgemini.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Map: In map we can store the value as key value 
// Key       Value
// Kalpesh   1001
// Patil     1002

// Map does not hold key as duplicate
// Map can have one key as null
// Map can have multiple duplicate Value

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "Kalpesh");
		m.put(103, "Shubham");
		m.put(104, "Akshay");
		m.put(102, "Jay");

		System.out.println("Map is:" + m);

		Set<Integer> s = m.keySet();
		System.out.println("All the keys of map are: " + s);

		Map<Integer, Employee> me = new HashMap<Integer, Employee>();
		me.put(1, new Employee(101, "Kalpesh", 10000));
		me.put(2, new Employee(102, "Jay", 10000));
		me.put(3, new Employee(103, "Akshay", 10000));
		me.put(4, new Employee(104, "Shubham", 10000));
		System.out.println("Employee map: " + me);

		System.out.println("Value for key 3: " + me.get(3));
	}

}
