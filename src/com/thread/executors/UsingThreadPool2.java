package com.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.thread.common.LoopTaskC;

public class UsingThreadPool2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread is about to Start");

		ExecutorService exService = Executors.newCachedThreadPool(new NamedThreadFactory());
		exService.submit(new LoopTaskC());
		exService.submit(new LoopTaskC());
		exService.submit(new LoopTaskC());
		exService.submit(new LoopTaskC());
		exService.submit(new LoopTaskC());
		exService.submit(new LoopTaskC());
		exService.submit(new LoopTaskC());
		exService.shutdown();
		

		System.out.println("Main Thread is about to End");
		exService.shutdown();
		
	}

}
