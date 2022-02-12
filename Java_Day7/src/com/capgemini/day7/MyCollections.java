package com.capgemini.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//Import java.util.ArrayList
//ArrayList Internally use the Array as data structure

//Collection In Java
//Collection is set of different implementation  
//Array
//Stack
//Linked List
//Queue
//Store the data in collection 
//easy to insert , update ,delete and sort and others operations

//Collection is interface 
//SET
//LIST

public class MyCollections {

	public static void main(String args[]) {

		// Created the ArrayList with String type
		// Add the value(Insert Operation)
		// Print the value ()

		// Creating the object of Array List
		// Constructs an empty list with an initial capacity of ten.
		LinkedList<Integer> list = new LinkedList<Integer>();
		// Add method is used to add the data

		// Insert new value to stack
		list.push(100);
		list.add(100);
		list.add(10);
		list.add(1);
		list.add(5);
		list.add(15);
		list.add(50);
		list.add(6);
		list.add(20);
		// Delete all the element of list
		// list.clear();
		// After converting the list to generic it only holds the given type

		// Looks at the object at the top of this stack without removing it from the
		// stack.
		System.out.println("Peek:");
		System.out.println(list.peek());

		// Removes the object at the top of this stack and returns that object as the
		// value of this function.
		System.out.println("Pop:");
		System.out.println(list.pop());

		// Retrieves and removes the first element of this list,or returns null if this
		// list is empty.
		System.out.println("PollFirst:");
		System.out.println(list.pollFirst());

		// Retrieves and removes the last element of this list,or returns null if this
		// list is empty.
		System.out.println("PollLast:");
		System.out.println(list.pollLast());

		// Retrieves and removes the head (first element) of this list.
		System.out.println("Poll:");
		System.out.println(list.poll());

		// Search for given value if it is there return true else false
		System.out.println("Contains: " + list.contains(20));

		// It will return the value using index
		System.out.println("Get: " + list.get(0));

		// indexOf()
		// It take value as input
		// It return the index value if found
		// If given value is not found return -1
		System.out.println("indexOf 10: " + list.indexOf(10));
		System.out.println("indexOf 1000: " + list.indexOf(1000));

		// isEmpty()
		// It will return true is list is empty
		// It will return false if list is not empty

		System.out.println("isEmpty: " + list.isEmpty());

		// iterator
		// Used to print or modify all the value
		// list.iterator(): Which will return iterator for list
		Iterator<Integer> it = list.iterator();

		// hasNext()
		// Return true if there is next value
		// false if there is no value
		while (it.hasNext()) {
			// next()
			// return the current value (it.)
			System.out.println("Iterator " + it.next());
		}

		// remove(index)
		// We can remove by index value
		// Return the String which is going to removed
		// If index not found OutOFBondException

		// delete operation on List(Array)
		// remove(value)
		// Return true if found and removed
		// false if it not found or not removed
		System.out.println("Removed value " + list.remove(1));

		// size()
		// return the size of list
		System.out.println("Size: " + list.size());

		// sort()
		// ASC by default
		Collections.sort(list);
		System.out.println("Sort ASC: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// DESC second parameters as Collections.reverseOrder()
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sort DESC: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Print the value
		// Java 1.8
		// Lambda expression
		System.out.println("forEach:");
		list.forEach(System.out::println);
		// list.forEach(e->System.out.println(e));

		// Directly with to string
		System.out.println("Print using toString: " + list.toString());

		// List in advance for loop
		// for
		// Data type
		// Space
		// variable name:
		// Array or List of collection
		System.out.println("Printing using advance for loop:");
		for (int num : list) {
			System.out.println(num);
		}
	}
}