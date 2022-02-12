package com.capgemini.day3;

//Data hiding 
//Make the variable private
//It can be accessed only by class method

class Employee {
	private int empID;
	private String name;
	private float salary;

	public Employee(int empID, String name, float salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
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
}

public class Encapsulation {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Kalpesh", 15000);// Their id, name, salary

		/*
		 * Employee.empID; //it is not visible // Employee.name; //it is not visible //
		 * Employee.salary; //it is not visible
		 */
		// It is not allowing private variables directly

		System.out.println(employee.getEmpID());
		System.out.println(employee.getName());
		System.out.printf("%.2f", employee.getSalary());
	}
}
