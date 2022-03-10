package com.capgemini.employeemanagementproject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		try {
			List<Employee> emp = new ArrayList<Employee>();
			EmployeeOperations op = new EmployeeOperations();
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
					System.out.println("System Closed Successfuly.");
					break;
				}
				// Create employee list
				if (ch == 1) {
					System.out.print("Enter the number of employee you want to enter: ");
					emp = op.createEmployee();
				}
				// Print employee list
				if (ch == 2) {
					op.showEmployees(emp);
				}
				// Search
				if (ch == 3) {
					System.out.print("Enter name which you want to search: ");
					op.searchEmployee(emp);
				}
				// Delete
				if (ch == 4) {
					op.deleteEmployee(emp);
				}
				// Sort ASC by name
				if (ch == 5) {
					op.sortAscByName(emp);
				}
				// Sort DESC by name
				if (ch == 6) {
					op.sortDescByName(emp);
				}
				// Sort ASC by id
				if (ch == 7) {
					op.sortAscById(emp);
				}
				// Sort DESC by id
				if (ch == 8) {
					op.sortDescById(emp);
				}
				// Minimum salary
				if (ch == 9) {
					double min = op.findMinSalary(emp);
					System.out.print("Minimum salary paid to employee is: " + min);
				}
				// Maximum salary
				if (ch == 10) {
					double max = op.findMaxSalary(emp);
					System.out.print("Maximum salary paid to employee is: " + max);
				}
				// Sum of salaries
				if (ch == 11) {
					double sum = op.totalSalary(emp);
					System.out.printf("Sum of salaries of all employees is: %.3f", sum);
				}
				// Average of salaries
				if (ch == 12) {
					double avg = op.averageSalary(emp);
					System.out.printf("Average of salaries of all employees is: %.3f", avg);
				}

				// For stopping the cursor to see the output
				System.out.print("\nPress enter to continue.");
				sc.nextLine();
				sc.nextLine();
			}
		} catch (InputMismatchException ime) {
			System.out.print("Please give proper input and try again.");
		} catch (Exception e) {
			System.out.println("Some Exception Occured.");
		}
	}
}