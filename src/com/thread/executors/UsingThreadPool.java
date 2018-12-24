package com.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.thread.common.LoopTaskA;

public class UsingThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread is about to Start");

		ExecutorService exService = Executors.newSingleThreadExecutor();
		exService.submit(new LoopTaskA());
		exService.submit(new LoopTaskA());
		exService.submit(new LoopTaskA());
		exService.submit(new LoopTaskA());
		exService.submit(new LoopTaskA());
		exService.submit(new LoopTaskA());
		exService.submit(new LoopTaskA());
		exService.shutdown();
		
		ExecutorService exService2 = Executors.newSingleThreadExecutor();
		exService2.submit(new LoopTaskA());
		exService2.submit(new LoopTaskA());
		exService2.submit(new LoopTaskA());
		exService2.submit(new LoopTaskA());
		exService2.submit(new LoopTaskA());
		exService2.submit(new LoopTaskA());
		exService2.submit(new LoopTaskA());
		exService2.shutdown();

		System.out.println("Main Thread is about to End");
		exService.shutdown();
		
	}

}
