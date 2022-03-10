package com.capgemini.employeemanagementproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeOperations {
	static Scanner in = new Scanner(System.in);

	public List<Employee> createEmployee() {
		int size = in.nextInt();
		List<Employee> emp = new ArrayList<Employee>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Name Of Employee " + (i + 1));
			String name = in.next();
			System.out.println("Enter Id Of Employee " + (i + 1));
			int id = in.nextInt();
			System.out.println("Enter Salary Of Employee " + (i + 1));
			double salary = in.nextDouble();
			emp.add(new Employee(name, id, salary));
		}
		return emp;
	}

	public void showEmployees(List<Employee> emp) {
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}
	}

	public void searchEmployee(List<Employee> emp) {
		String name = in.next();
		boolean flag = true;
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getName().equalsIgnoreCase(name)) {
				System.out.println("Employee Found: " + emp.get(i));
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Record not found");
		}
	}

	public void deleteEmployee(List<Employee> emp) {
		boolean flag = true;
		showEmployees(emp);
		System.out.print("Enter the id of employee for which you want to delete: ");
		int id = in.nextInt();
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getId() == id) {
				System.out.println("Deleting record " + emp.get(i).toString());
				emp.remove(i);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("No matching ID found");
		}
	}

	public void sortAscByName(List<Employee> emp) {
		Employee temp;
		for (int i = 0; i < emp.size() - 1; i++) {
			for (int j = i + 1; j < emp.size(); j++) {
				/*
				 * Syntax: int str1.compareTo(String str2) Working: It compares and returns the
				 * following values as follows: if (string1 > string2) it returns a positive
				 * value. if both the strings are equal lexicographically i.e.(string1 ==
				 * string2) it returns 0. if (string1 < string2) it returns a negative value.
				 */
				if ((emp.get(i).getName().compareTo(emp.get(j).getName())) > 0) {
					temp = emp.get(i);
					emp.set(i, emp.get(j));
					emp.set(j, temp);
				}
			}
		}
		System.out.println("Sorted employees in ASC order by Name are:");
		showEmployees(emp);
	}

	public void sortDescByName(List<Employee> emp) {
		Employee temp;
		for (int i = 0; i < emp.size() - 1; i++) {
			for (int j = i + 1; j < emp.size(); j++) {
				if ((emp.get(i).getName().compareTo(emp.get(j).getName())) < 0) {
					temp = emp.get(i);
					emp.set(i, emp.get(j));
					emp.set(j, temp);
				}
			}
		}
		System.out.println("Sorted employees in DESC order by Name are:");
		showEmployees(emp);
	}

	public void sortAscById(List<Employee> emp) {
		Employee temp;
		for (int i = 0; i < emp.size() - 1; i++) {
			for (int j = i + 1; j < emp.size(); j++) {
				if (emp.get(i).getId() > emp.get(j).getId()) {
					temp = emp.get(i);
					emp.set(i, emp.get(j));
					emp.set(j, temp);
				}
			}
		}
		System.out.println("Sorted employees in ASC order by ID are:");
		showEmployees(emp);
	}

	public void sortDescById(List<Employee> emp) {
		Employee temp;
		for (int i = 0; i < emp.size() - 1; i++) {
			for (int j = i + 1; j < emp.size(); j++) {
				if (emp.get(i).getId() < emp.get(j).getId()) {
					temp = emp.get(i);
					emp.set(i, emp.get(j));
					emp.set(j, temp);
				}
			}
		}
		System.out.println("Sorted employees in DESC order by ID are:");
		showEmployees(emp);
	}

	public double findMinSalary(List<Employee> emp) {
		double min = emp.get(0).getSalary();
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getSalary() < min) {
				min = emp.get(i).getSalary();
			}
		}
		return min;
	}

	public double findMaxSalary(List<Employee> emp) {
		double max = emp.get(0).getSalary();
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getSalary() > max) {
				max = emp.get(i).getSalary();
			}
		}
		return max;
	}

	public double totalSalary(List<Employee> emp) {
		double sum = 0;
		for (int i = 0; i < emp.size(); i++) {
			sum += emp.get(i).getSalary();
		}
		return sum;
	}

	public double averageSalary(List<Employee> emp) {
		double sum = 0, avg;
		for (int i = 0; i < emp.size(); i++) {
			sum += emp.get(i).getSalary();
		}
		avg = sum / emp.size();
		return avg;
	}
}
