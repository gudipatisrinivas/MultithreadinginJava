package com.thread.exception;

public class ExceptionLeakingTask implements Runnable {

	public ExceptionLeakingTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		throw new RuntimeException();

	}

}
