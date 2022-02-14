package com.capgemini.day11;

import java.io.FileWriter;

public class MyFileWriter {

	public static void main(String[] args) {
		String str = "Hello World!";
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write(str);
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File Write Successful.");
	}

}
