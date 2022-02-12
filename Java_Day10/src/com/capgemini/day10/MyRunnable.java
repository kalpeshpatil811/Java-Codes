package com.capgemini.day10;

class TestRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// currentThread(): It will give the currently running thread
			// All the props using methods
			System.out.println("Thread class " + Thread.currentThread().getName() + " " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class MyRunnable {

	public static void main(String[] args) {
		// Creating the object of Runnable Interface implemented class
		TestRunnable tr = new TestRunnable();
		// Create Object of Thread class and giving runnable interface Object
		// Use thread Constructor, pass the runnable references
		Thread t1 = new Thread(tr);
		t1.setName("T1");
		t1.start();

		Thread t2 = new Thread(tr);
		t2.setName("T2");
		t2.start();
		System.out.println("Number of active threads: " + Thread.activeCount());
		System.out.println("T2 alive?: " + t2.isAlive());
		System.out.println("T2 priority: " + t2.getPriority());
	}

}
