package com.capgemini.day3;

class Shape {
	public void drawShape() {
		System.out.println("Draw Shape");
	}
}

class Line extends Shape {
	public void drawShape() {
		System.out.println("Draw Line");
	}
}

class Circle extends Shape {
	public void drawShape() {
		System.out.println("Draw Circle");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// Parent class can hold the object of child class
		Shape s = new Circle();
		s.drawShape();
		s = new Line();
		s.drawShape();
	}
}
