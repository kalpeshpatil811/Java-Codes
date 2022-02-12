package com.capgemini.day10;

// Thread
// Thread is part of process
// Thread share the same memory of process
// Thread has life cycle:
// New --> Runnable
// Runnable --> Running(Automatically)
// Running --> Waiting(Sleep, wait)
// Waiting --> Runnable(Notify,Notify All, Resume method)

class Test extends Thread {
	// Multiple thread can can and execute this code

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// currentThread(): It will give the currently running thread
			System.out.println("Thread class " + currentThread().getName() + " " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThread {

	public static void main(String[] args) {
		Test t1 = new Test();
		// Used to set priority
		t1.setPriority(10); // Range 1-10
		// start() method is use to start the thread and internally call the run()
		// method
		t1.start();

		Test t2 = new Test();
		// setName is used to set the name of thread
		t2.setName("T2"); // By default there is also a name like Thread-no.
		t2.start();

	}

}
