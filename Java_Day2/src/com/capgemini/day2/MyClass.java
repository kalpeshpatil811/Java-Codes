package com.capgemini.day2;

class Phone {
	private String brand;
	private String colour;
	private int price;
	private int storage;
	private float screenSize;

	public Phone() {
	}

	public Phone(String brand, String colour, int price, int storage, float screenSize) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.storage = storage;
		this.screenSize = screenSize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public float getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}

	public void print() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Colour: " + this.colour);
		System.out.println("Price: " + this.price);
		System.out.println("Storage: " + this.storage);
		System.out.println("Screen Size: " + this.screenSize);
		System.out.println();
	}
}

class Person {
	private String name;
	private int age;
	private String address;
	private char gender;

	public Person() {
	}

	public Person(String name, int age, String address, char gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Address: " + this.address);
		System.out.println("Gender: " + this.gender);
		System.out.println();
	}
}

class Car {
	private String brand;
	private String colour;
	private int price;

	public Car() {
	}

	public Car(String brand, String colour, int price) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Colour: " + this.colour);
		System.out.println("Price: " + this.price);
		System.out.println();
	}
}

public class MyClass {

	public static void main(String[] args) {
		System.out.println("Phone Class:\n");
		Phone p1 = new Phone("Nokia", "Grey", 6000, 16, 5.5f);
		p1.print();
		Phone p2 = new Phone();
		p2.print();
		Phone p3 = new Phone("Samsung", "Blue", 10000, 30, 6.0f);
		p3.print();
		System.out.println("==================================");

		System.out.println("Person Class:\n");
		Person per1 = new Person("Kalpesh", 21, "Aurangabad", 'M');
		per1.print();
		Person per2 = new Person("XYZ", 21, "Delhi", 'F');
		per2.print();
		Person per3 = new Person();
		per3.print();
		System.out.println("==================================");

		System.out.println("Car Class:\n");
		Car c1 = new Car("Audi", "White", 4000000);
		c1.print();
		Car c2 = new Car("BMW", "Blue", 5000000);
		c2.print();
		Car c3 = new Car();
		c3.print();
		System.out.println("==================================");
	}
}
