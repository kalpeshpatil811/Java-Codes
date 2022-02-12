package com.capgemini.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream is interface in java
//flow the data from one direction to another
//if stream is used once. You cannot run again
//stream has already been operated upon or closed

public class MyStreamApi {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(-70);
		ls.add(-90);
		ls.add(20);

		// Generic Type
		// Stream s = ls.stream();
		Stream<Integer> s = ls.stream();
		s.forEach(System.out::println);
		System.out.println();

		ls.stream().forEach(System.out::println); // again using stream
		System.out.println();

		ls.stream().forEach(System.err::println);
		System.out.println();

		ls.stream().forEach(str -> System.out.println(str)); // Give each element one by one
		System.out.println();

		// filter
		// returns true if data needs to be considered
		// returns false if data not to be considered
		ls.stream().filter(num -> num >= 20).forEach(System.out::println);
		System.out.println();

		// Collection the data and return back
		// filters the data of only positive num
		// collectors method is used to send it back
		// collect method will collect all the data and return as list
		// Collectors.toList() converts the data to list
		List<Integer> filterList = ls.stream().filter(num -> num > 10).collect(Collectors.toList());
		filterList.forEach(System.out::println);
		System.out.println();

		// you can modify the data and return it
		// send back true and false of logical
		// true
		// false
		// err(error) print in red color
		ls.stream().map(data -> data * 2).forEach(System.out::println);
		System.out.println();

		ls.stream().map(data -> data > 0).forEach(System.err::println); // err is used to print output in red color
		System.out.println();

		List<Integer> filterList1 = ls.stream().map(data -> data / 3).collect(Collectors.toList());
		filterList1.forEach(System.out::println);
		System.out.println();

		System.out.println(ls.stream().count());
		System.out.println();

		// give the unique number
		ls.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println();

		// Collections.reverseOrder();
		System.out.println(ls.stream().max(Collections.reverseOrder()));
		System.out.println(ls.stream().min(Collections.reverseOrder()));
		System.out.println();

		ls.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println();

		ls.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.println(e));
		System.out.println();

		System.out.println("Max " + ls.stream().min(Collections.reverseOrder()));
		System.out.println("Min " + ls.stream().max(Collections.reverseOrder()));
		System.out.println();

		IntSummaryStatistics state = ls.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Count " + state.getCount());
		System.out.println("Sum " + state.getSum());
		System.out.println("Min " + state.getMax());
		System.out.println("Max " + state.getMin());
		System.out.println("Avg " + state.getAverage());
		System.out.println("State: " + state);
	}
}