package com.thread.exception;

public class HandlingExceptionForEveryThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String curretThread = Thread.currentThread().getName();
		System.out.println("Hello" + curretThread + "Started");
		Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler("DEFAULT_HANDLER"));
			new Thread(new ExceptionLeakingTask(), "MY Thread-1").start();

			new Thread(new ExceptionLeakingTask(), "MY Thread-2").start();

			new Thread(new ExceptionLeakingTask(), "MY Thread-3").start();

			new Thread(new ExceptionLeakingTask(), "MY Thread-4").start();
		

	}

}
