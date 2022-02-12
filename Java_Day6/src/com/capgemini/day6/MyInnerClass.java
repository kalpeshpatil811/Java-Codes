package com.capgemini.day6;

class OuterClass {
	InnerClass1 i = new InnerClass1();

	public void print() {
		System.out.println("Outer Class");
		i.print(); // Non static inner class method
	}

	// Inner class
	// It can be accessed with class name

	// Non static inner class
	// You cannot create object outside the class
	// Create the object locally inside class
	// Call the method using that object anywhere in method
	class InnerClass1 {
		public void print() {
			System.out.println("Non Static InnerClass1");
		}
	}

	// Static inner class
	static class InnerClass2 {
		public void print() {
			System.out.println("Static InnerClass2");
		}
	}
}

public class MyInnerClass {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		o.print();
		OuterClass.InnerClass2 i = new OuterClass.InnerClass2();
		i.print();
	}

}
