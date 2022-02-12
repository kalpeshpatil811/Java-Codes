package com.capgemini.day9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Employee implements Comparator<Employee> {
	private int id;
	private String name;
	private int salary;

	public Employee() {
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalalry(int salalry) {
		this.salary = salalry;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salalry=" + salary + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		}
		return 0;
	}

}

public class MyStreamEmployee {

	public static void main(String args[]) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Kalpesh", 1000));
		employeeList.add(new Employee(10, "Jay", 5000));
		employeeList.add(new Employee(2, "Shubahm", 2000));
		employeeList.add(new Employee(100, "Yash", 8000));
		employeeList.add(new Employee(5, "Rohit", 20000));
		employeeList.stream().forEach(System.out::println);
		System.out.println();

		// Fetch all the employee and print name whose salary is greater than 5000
		List<Employee> filterEmployee = employeeList.stream().filter(e -> e.getSalary() >= 5000)
				.collect(Collectors.toList());
		filterEmployee.forEach(System.out::println);
		System.out.println();

		// print only name from list
		// filterEmployee.forEach(e->System.err.println(e.getName()));
		// Change the list of value to upper case and print name
		List<String> filterEmployeeUpperCase = employeeList.stream().map(e -> e.getName().toUpperCase())
				.collect(Collectors.toList());
		filterEmployeeUpperCase.forEach(e -> System.out.println(e));
		System.out.println();

		IntSummaryStatistics state = employeeList.stream().mapToInt(e -> e.getSalary()).summaryStatistics();
		System.out.println(state);
		System.out.println();

		// find the maximum salary of employee
		System.out.println("Max " + state.getMax());

		// find the minimum salary of employee
		System.out.println("Min " + state.getMin());

		// find the sum of all the salary
		// total paid salary of company
		System.out.println("Sum " + state.getSum());

		// find the avg salary
		System.out.println("Avg " + state.getAverage());
		System.out.println();

		// sorting of user defined data type
		// Employee cannot be cast to java.lang.Comparable
		// sorting along
		List<Employee> ls = employeeList.stream().sorted(new Employee()).collect(Collectors.toList());
		ls.forEach(System.out::println);

	}

}