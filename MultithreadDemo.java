package com.josh.java.Training.daysix;

/*Runnable is an interface that is to be implemented by a class whose instances are intended to be executed by a thread. */
public class MultithreadDemo implements Runnable {
	@Override
	public void run() {
		System.out.println("implimentation class");
	}

	public static void main(String[] args) {
		MultithreadDemo demo = new MultithreadDemo();
		Thread thread = new Thread(demo);
		thread.start();

	}

}
