package com.capgemini.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;

class MyException {
	public void myNewException() throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream("f:\\file.txt");
	}
}

public class MyThrows {

	public static void main(String[] args) {
		// We can have multiple catch block
		// Child should come before parent class
		try {
			// Just rearrange the line of code to first which you want see in exception
			MyException exception = new MyException();
			exception.myNewException();
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (FileSystemNotFoundException e) {
			e.printStackTrace();
		}
	}
}
