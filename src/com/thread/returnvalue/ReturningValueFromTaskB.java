package com.thread.returnvalue;

import java.util.concurrent.TimeUnit;

public class ReturningValueFromTaskB implements Runnable {
	private int a;
	private int b;
	private long sleepTime;
	private int sum;
	
	private static int count=0;
	private int instanceNumber;
	private String taskId;
	private volatile boolean done;
	private ResultListener<Integer> listener;
	
	public ResultListener<Integer> getListener() {
		return listener;
	}


	public void setListener(ResultListener<Integer> listener) {
		this.listener = listener;
	}


	public ReturningValueFromTaskB(int a, int b, long sleepTime,ResultListener<Integer> listener) {
		super();
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		this.listener=listener;
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
		listener.notifyListener(sum);
	}

}
