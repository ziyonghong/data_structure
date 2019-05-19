package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
	static Thread t1 = new Thread(new Runnable() {
		public void run() {
			System.out.println("t1 start");
		}
	});
	static Thread t2 = new Thread(new Runnable() {
		public void run() {
			System.out.println("t2 start");
		}
	});
	static Thread t3 = new Thread(new Runnable() {
		public void run() {
			System.out.println("t3 start");
		}
	});

	public static void main(String[] args) throws InterruptedException {
		// t1.start();
		// t1.join();
		// t2.start();
		// t2.join();
		// t3.start();
		// t3.join();
		ExecutorService e = Executors.newSingleThreadExecutor();
		e.submit(t1);
		e.submit(t2);
		e.submit(t3);
		

	}
}
