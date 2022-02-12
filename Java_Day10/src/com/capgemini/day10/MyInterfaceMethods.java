package com.capgemini.day10;

interface TestInterface {
	// Only abstract method were allowed
	abstract public void test();

	// We cannot add non-abstract methods
	// public void show() {
	// System.out.println("Method Show");
	// }

	// Non abstract in interface can be done with:
	// Static: with static keyword we will be able to take static method(non
	// abstract method)
	// Use the class interface name to call the method
	static public void showPrint() {
		System.out.println("Static method showPrint");
	}

	// Default: Any number of default methods inside interface
	// These are non abstract methods
	default public void print() {
		System.out.println("Default method print");
	}

}

class Test1 implements TestInterface {

	@Override
	public void test() {
		System.out.println("Abstract method test");
	}

}

public class MyInterfaceMethods {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
		t.print();

		TestInterface inter = new TestInterface() {

			@Override
			public void test() {
				System.out.println("Abstract method test in main function");
			}
		};
		inter.test();
		inter.print();

		TestInterface.showPrint();

	}

}
