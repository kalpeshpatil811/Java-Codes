package com.capgemini.day2;

class Student {
	private int rollNo;
	private String name;
	static String schoolName;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", schoolName=" + schoolName + "]";
	}

	public static void staticMethod() {
		System.out.println("School Name: " + schoolName);
	}

	static {
		System.out.println("I am Static block.");
	}

	static class Address {
		int houseName;
		String streetName;

		public void print() {
			System.out.println("Nested Static class.");
		}
	}
}

public class MyStatic {

	public static void main(String[] args) {
		Student.schoolName = "XYZ School";

		Student s1 = new Student(101, "Kalpesh");
		Student s2 = new Student(102, "Mahesh");
		Student s3 = new Student(103, "Ansar");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		Student.staticMethod();

		Student.Address address = new Student.Address();
		address.print();
	}
}
