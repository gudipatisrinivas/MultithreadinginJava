package com.thread.returnvalue;

import java.util.concurrent.TimeUnit;

public class ReturningValueFromTaskA implements Runnable {
	private int a;
	private int b;
	private long sleepTime;
	private int sum;
	
	private static int count=0;
	private int instanceNumber;
	private String taskId;
	private volatile boolean done;
	
	
	public ReturningValueFromTaskA(int a, int b, long sleepTime) {
		super();
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		this.instanceNumber=++count;
		this.taskId="ValueTaskA"+instanceNumber;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String curretThreadName = Thread.currentThread().getName();
		System.out.println("ThreadName" + curretThreadName);
		System.out.println("[" + curretThreadName + "Sleep Time" + sleepTime + "Mills");
		try {
			TimeUnit.MILLISECONDS.sleep(sleepTime);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		sum = a + b;
		System.out.println("ThreadName" + curretThreadName);
		done=true;
		synchronized (this) {
			System.out.println("Curret Thread"+curretThreadName);
			this.notifyAll();
			
		}
	}
	
	public int getSum() {
		if (!done) {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName());

				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		return sum;

	}

}
