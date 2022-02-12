package com.capgemini.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Employee {
	private int id;
	private String name;
	private float salary;

	public Employee(int id, String name, float salary) {
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

//Collections 

/*
 * Set: Set does not maintain the order. Duplicate element is not allowed
 */

/*
 * HashSet: Part of set. It does not maintain order and does not contain
 * duplicate
 */

/*
 * LinkedHashSet: Duplicate not allowed Maintain the order
 */

/*
 * TreeSet: It is sorting the data. Duplicate is not allowed
 */

/*
 * List: List Maintain the order. Have any number of null and duplicate element
 */

/*
 * TreeSet, LinkedHashSet and HashSet in Java are three Set implementation in
 * collection framework and like many others they are also used to store
 * objects. Main feature of TreeSet is sorting, LinkedHashSet is insertion order
 * and HashSet is just general purpose collection for storing object. HashSet is
 * implemented using HashMap in Java while TreeSet is implemented using TreeMap.
 * TreeSet is a SortedSet implementation which allows it to keep elements in the
 * sorted order defined by either Comparable or Comparator interface. Comparable
 * is used for natural order sorting and Comparator for custom order sorting of
 * objects, which can be provided while creating instance of TreeSet.
 */

public class MySet {

	public static void main(String args[]) {
		// Without generic Class
		// EnumSet<Integer> es = new EnumSet<Integer>();

		// HashSet
		Set<Integer> s = new HashSet<Integer>();
		s.add(15);
		// Clear the set
		s.clear();

		s.add(4);
		s.add(10);
		s.add(1);
		s.add(4);
		s.add(100);

		// Find the data in set
		System.out.println("Contains: " + s.contains(10));

		// Set is empty or not
		System.out.println("isEmpty: " + s.isEmpty());

		// Remove using element
		System.out.println("Remove: " + s.remove(10));

		// Return the size of set
		System.out.println("Size: " + s.size());

		// Convert set to object array
		Object array = (Object) s.toArray();
		System.out.println(array.toString());

		// LinkedHashSet
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(4);
		lhs.add(10);
		lhs.add(1);
		lhs.add(4);
		lhs.add(100);

		// TreeSet
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(4);
		ts.add(10);
		ts.add(1);
		ts.add(4);
		ts.add(100);

		System.out.println("HashSet: " + s);
		System.out.println("LinkedHashSet: " + lhs);
		System.out.println("TreeSet: " + ts);

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(10, "Kalpesh", 100.0f));
		employeeList.add(new Employee(1, "Priya", 100.0f));
		employeeList.add(new Employee(2, "Kumar", 100.0f));
		employeeList.add(new Employee(100, "Anil", 100.0f));
		employeeList.add(new Employee(5, "Zee", 100.0f));

		System.out.println("EmployeeList:");
		employeeList.forEach(System.out::println);

		Set<Employee> employeeSet = new LinkedHashSet<Employee>();
		employeeSet.add(new Employee(10, "Ansar", 100.0f));
		employeeSet.add(new Employee(1, "Priya", 100.0f));
		employeeSet.add(new Employee(2, "Kumar", 100.0f));
		employeeSet.add(new Employee(100, "Anil", 100.0f));
		employeeSet.add(new Employee(5, "Zee", 100.0f));
		employeeSet.add(new Employee(100, "Anil", 100.0f));
		employeeSet.add(new Employee(5, "Zee", 100.0f));

		System.err.println("EmployeeSet:");
		employeeSet.forEach(System.err::println);
	}

}