package com.thread.exception;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionHandler implements UncaughtExceptionHandler {
	
	private String handler;
	
	public ThreadExceptionHandler() {
		super();
	}

	public ThreadExceptionHandler(String handlerId) {
		// TODO Auto-generated constructor stub
		this.handler=handlerId;
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println(this+"Caught exception in thread"+t.getName());

	}

	@Override
	public String toString() {
		return "ThreadExceptionHandler [handler=" + handler + "]";
	}

}
