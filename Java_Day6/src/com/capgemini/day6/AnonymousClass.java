package com.capgemini.day6;

// Interface also can have member variable
// Which class implement the abstract method can access the member variable
// We cannot create object of interface
interface A {
	int a = 10;

	public void print();
}

class Test implements A {

	@Override
	public void print() {
		System.out.println("Implemented interface method");
	}

}

public class AnonymousClass {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();

		// Anonymous class (Inner class)
		// Because it does have any name
		A a = new A() {

			@Override
			public void print() {
				System.out.println("Anonymous Inner Class");
				System.out.println(a);
			}

		};

		a.print();
	}
}
