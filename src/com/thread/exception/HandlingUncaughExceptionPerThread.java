package com.thread.exception;

public class HandlingUncaughExceptionPerThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentThread = Thread.currentThread().getName();
		
		Thread t1=new Thread(new ExceptionLeakingTask(),"MyTask-1");
		t1.setUncaughtExceptionHandler(new ThreadExceptionHandler());
		t1.start();
		
		Thread t2=new Thread(new ExceptionLeakingTask(),"MyTask-2");
		t2.setUncaughtExceptionHandler(new ThreadExceptionHandler());
		
		t2.start();
		
		Thread t3=new Thread(new ExceptionLeakingTask(),"MyTask-3");
		t3.setUncaughtExceptionHandler(new ThreadExceptionHandler());
		
		t3.start();
		
		
		
		System.out.println("Hello" + currentThread + "Started");
		

	}

}
