package com.capgemini.day4;

import java.util.Scanner;

class Employee {
	private String name;
	private int id;
	private double salary;

	public Employee() {
	}

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
}

public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] emp = {};
		while (true) {
			System.out.println("Enter 1 to create a list of employee");
			System.out.println("Enter 2 to print a list of employee");
			System.out.println("Enter 3 to search the employee");
			System.out.println("Enter 4 to delete the employee");
			System.out.println("Enter 5 to sort the employee in ASC order by Name");
			System.out.println("Enter 6 to sort the employee in DESC order by Name");
			System.out.println("Enter 7 to sort the employee in ASC order by ID");
			System.out.println("Enter 8 to sort the employee in DESC order by ID");
			System.out.println("Enter 9 to find minimun salary paid to employee");
			System.out.println("Enter 10 to find maximum salary paid to employee");
			System.out.println("Enter 11 to find sum of all employees Salary");
			System.out.println("Enter 12 to find average of all employees Salary");
			System.out.println("Enter 0 to exit");

			int ch = sc.nextInt();
			// Exit
			if (ch == 0) {
				break;
			}
			// Create employee list
			if (ch == 1) {
				System.out.print("Enter the number of employee you want to enter: ");
				int size = sc.nextInt();
				emp = new Employee[size];

				for (int i = 0; i < size; i++) {
					System.out.println("Enter Name Of Employee " + (i + 1));
					String name = sc.next();
					System.out.println("Enter Id Of Employee " + (i + 1));
					int id = sc.nextInt();
					System.out.println("Enter Salary Of Employee " + (i + 1));
					double salary = sc.nextDouble();
					emp[i] = new Employee(name, id, salary);
				}
			}
			// Print employee list
			if (ch == 2) {
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
					}
				}
			}
			// Search
			if (ch == 3) {
				System.out.print("Enter name which you want to search: ");
				String name = sc.next();
				boolean flag = true;
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getName().equalsIgnoreCase(name)) {
						System.out.println("Employee Found: " + emp[i].toString());
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("Record not found");
				}
			}
			// Delete
			if (ch == 4) {
				boolean flag = true;
				for (int i = 0; i < emp.length; i++) {
					System.out.println(emp[i]);
				}
				System.out.print("Enter the id of employee for which you want to delete: ");
				int id = sc.nextInt();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() == id) {
						System.out.println("Deleting record " + emp[i].toString());
						emp[i] = new Employee();
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("No matching ID found");
				}
			}
			// Sort ASC by name
			if (ch == 5) {
				Employee temp;
				for (int i = 0; i < emp.length - 1; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						/*
						 * Syntax: int str1.compareTo(String str2) Working: It compares and returns the
						 * following values as follows: if (string1 > string2) it returns a positive
						 * value. if both the strings are equal lexicographically i.e.(string1 ==
						 * string2) it returns 0. if (string1 < string2) it returns a negative value.
						 */
						if ((emp[i].getName().compareTo(emp[j].getName())) > 0) {
							temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				System.out.println("Sorted employees in ASC order by Name are:");
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
					}
				}
			}
			// Sort DESC by name
			if (ch == 6) {
				Employee temp;
				for (int i = 0; i < emp.length - 1; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if ((emp[i].getName().compareTo(emp[j].getName())) < 0) {
							temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				System.out.println("Sorted employees in DESC order by Name are:");
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
					}
				}
			}
			// Sort ASC by id
			if (ch == 7) {
				Employee temp;
				for (int i = 0; i < emp.length - 1; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if (emp[i].getId() > emp[j].getId()) {
							temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				System.out.println("Sorted employees in ASC order by ID are:");
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
					}
				}
			}
			// Sort DESC by id
			if (ch == 8) {
				Employee temp;
				for (int i = 0; i < emp.length - 1; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if (emp[i].getId() < emp[j].getId()) {
							temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				System.out.println("Sorted employees in DESC order by ID are:");
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
					}
				}
			}
			// Minimum salary
			if (ch == 9) {
				double min = emp[0].getSalary();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getSalary() < min) {
						min = emp[i].getSalary();
					}
				}
				System.out.print("Minimum salary paid to employee is: " + min);
			}
			// Maximum salary
			if (ch == 10) {
				double max = emp[0].getSalary();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getSalary() > max) {
						max = emp[i].getSalary();
					}
				}
				System.out.print("Maximum salary paid to employee is: " + max);
			}
			// Sum of salaries
			if (ch == 11) {
				double sum = 0;
				for (int i = 0; i < emp.length; i++) {
					sum += emp[i].getSalary();
				}
				System.out.printf("Sum of salaries of all employees is: %.3f", sum);
			}
			// Average of salaries
			if (ch == 12) {
				double sum = 0, avg;
				for (int i = 0; i < emp.length; i++) {
					sum += emp[i].getSalary();
				}
				avg = sum / emp.length;
				System.out.printf("Average of salaries of all employees is: %.3f", avg);
			}

			// For stopping the cursor to see the output
			System.out.print("\nPress enter to continue.");
			sc.nextLine();
			sc.nextLine();
		}
		sc.close();
		return;
	}
}