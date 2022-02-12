package com.capgemini.day7;

// Generic class:
// We can pass the type of variable while creating the object
// T,V,Z will contain the data type
// Declare the class variable with given type
// Change the other place with same data type 
class Person<T, V, Z> {
	private T name;
	private V id;
	private Z salary;

	public Person(T name, V id, Z salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void printPerson() {
		System.out.println("Name: " + this.name);
		System.out.println("ID: " + this.id);
		System.out.println("Salary: " + this.salary);
	}

}

public class GenericClass {

	public static void main(String args[]) {
		// Person p = new Person("Kalpesh", 10, 10);
		// p.printPerson();
		// We should not fix the type of member variable

		// Generic class Object
		// Wrapper class
		// It will not take the primitive type
		// Generic class with parameters passing
		Person<String, Float, Double> p1 = new Person<String, Float, Double>("Kalpesh", 10f, 1.0);

		p1.printPerson();

		// We can give any data type variables
		// While declaring its object we have to mention that data types.(We can use
		// only wrapper classes, No primitive data types)
		Person<Character, Integer, Integer> p2 = new Person<Character, Integer, Integer>('K', 10, 10);

		p2.printPerson();
	}
}