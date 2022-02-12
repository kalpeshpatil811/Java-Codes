package com.capgemini.day3;

class A {
	public int a = 10;

	public void printA() {
		System.out.println("I am class A");
	}
}

class B extends A {
	public int b = 20;

	public void printB() {
		System.out.println("I am class B");
	}
}

public class MyInheritance {

	public static void main(String[] args) {
		A a = new A();
		a.printA();
		B b = new B();
		b.printB();

		b.printA();
		b.printB();
		System.out.println("a belongs to class A " + b.a);
		System.out.println("b belongs to class B " + b.b);
	}

}
