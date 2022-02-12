package com.capgemini.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int age;
	private int std;
	private String city;

	public Student(int rollno, String name, int age, int std, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.std = std;
		this.city = city;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", std=" + std + ", city=" + city
				+ "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.getName());
	}
}

public class StudentData {

	public static void main(String[] args) {
		HashSet<Student> s = new HashSet<Student>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to insert");
			System.out.println("Enter 2 to delete");
			System.out.println("Enter 3 to update");
			System.out.println("Enter 4 to sort ASC");
			System.out.println("Enter 5 to sort DESC");
			System.out.println("Enter 6 to print the size");
			System.out.println("Enter 7 for Exit");

			int ch = sc.nextInt();

			if (ch == 1) {
				System.out.print("Enter roll number of student: ");
				int roll = sc.nextInt();
				System.out.print("Enter name of student: ");
				String name = sc.next();
				System.out.print("Enter age of student: ");
				int age = sc.nextInt();
				System.out.print("Enter std of student: ");
				int std = sc.nextInt();
				System.out.print("Enter city of student: ");
				String city = sc.next();
				s.add(new Student(roll, name, age, std, city));

				System.out.println("All Students:");
				s.forEach(System.out::println);
			}
			if (ch == 2) {
				System.out.print("Enter name to delete: ");
				String name = sc.next();

				for (Student stu : s) {
					if (stu.getName().equals(name)) {
						s.remove(stu);
						break;
					}
				}

				if (s.size() == 0) {
					System.out.println("Set is empty.");
					continue;
				}
				System.out.println("All Students:");
				s.forEach(System.out::println);
			}

			if (ch == 3) {
				System.out.print("Enter the rollno for student you want to update: ");
				int roll = sc.nextInt();
				for (Student stu : s) {
					if (stu.getRollno() == roll) {
						System.out.println("What do you want to update:\n1. Name\n2. Age\n3. Standard\n4. City");
						int opt = sc.nextInt();
						if (opt == 1) {
							System.out.print("Enter name of student: ");
							String name = sc.next();
							stu.setName(name);
						}
						if (opt == 2) {
							System.out.print("Enter age of student: ");
							int age = sc.nextInt();
							stu.setAge(age);
						}
						if (opt == 3) {
							System.out.print("Enter std of student: ");
							int std = sc.nextInt();
							stu.setStd(std);
						}
						if (opt == 4) {
							System.out.print("Enter city of student: ");
							String city = sc.next();
							stu.setCity(city);
						}
						break;
					}
				}
				System.out.println("Updated set:");
				s.forEach(System.out::println);
				continue;
			}

			if (ch == 4) {
				ArrayList<Student> al = new ArrayList<Student>(s);
				Collections.sort(al);
				al.forEach(System.out::println);
			}

			if (ch == 5) {
				ArrayList<Student> al = new ArrayList<Student>(s);
				Collections.sort(al, Collections.reverseOrder());
				al.forEach(System.out::println);
			}

			if (ch == 6) {
				System.out.println("Size of set is: " + s.size());
			}

			if (ch == 7) {
				break;
			}
		}
		sc.close();
	}
}
