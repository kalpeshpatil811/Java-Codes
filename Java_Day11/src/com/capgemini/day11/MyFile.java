package com.capgemini.day11;

import java.io.File;
import java.util.Scanner;

public class MyFile {

	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			System.out.println("Name: " + file.getName());
			System.out.println("Path: " + file.getPath());
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Parent: " + file.getParent());
			System.out.println("Can Read: " + file.canRead());
			System.out.println("Can Write: " + file.canWrite());
			System.out.println("Can Execute: " + file.canExecute());
			System.out.println("To URI: " + file.toURI());

			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.print(sc.nextLine());
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
