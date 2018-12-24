package com.thread.executors;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {
	
	private static int count=0;
	private static String Name="MyThread-";
	
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t=new Thread(r, Name+ ++count);
		return t;
	}

}
