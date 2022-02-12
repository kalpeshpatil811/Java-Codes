package com.capgemini.day3;

abstract class Mobile {
	final int price = 1000;

	// abstract methods
	abstract public void calling();

	abstract public void sendSMS();

	// non abstract methods
	public void chargingUSB() {
		System.out.println("USB charging ");
	}
}

class Google extends Mobile {
	@Override
	public void calling() {
		System.out.println("Google 4G calling");
	}

	@Override
	public void sendSMS() {
		System.out.println("Send sms using internet");
	}

	public void android() {
		System.out.println("Android Phone");
	}
}

class Apple extends Mobile {
	@Override
	public void calling() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub

	}

	public void IOS() {
		System.out.println("IOS 14");
	}

	public void getProcessor() {
		System.out.println("I am A13 chip");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		// Google
		Google g = new Google();
		g.android();
		g.calling();
		System.out.println("Price: " + g.price);
		g.sendSMS();
		g.chargingUSB();

		// Apple
		Apple a = new Apple();
		a.IOS();
		a.getProcessor();
	}
}
