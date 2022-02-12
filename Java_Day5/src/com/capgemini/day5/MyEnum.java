package com.capgemini.day5;
//ENUM --Enum is used to declare list of constant value in java

//constant --Constant are those value once it is declared cannot be changed
//COLOR -BLUE,RED,GREEN
//DAY --SUNDAY,MONDAY

//one method Use Constant
//Create a class
//Make the variable as static and final and public
//it can be access on another
//final value should not change 
//static -using class name we can access it
/*class Color
{
	public final static  String RED="RED";	
	public final static  String GREEN="GREEN";
	public final static  String BLUE="BLUE";
}
*/
//ENum can be used inside class and outside of class

public class MyEnum {
	enum Color {
		RED, GREEN, CYAN, WHITE;
	}

	public static void main(String[] args) {
		Color[] c = Color.values();
		for (Color d : c) {
			System.out.println(d.name());
		}
	}
}
