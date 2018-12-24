package com.thread.common;

public class LoopTaskA implements Runnable {
	private static int count=0;
	private int id;
	
	public  synchronized void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Starting the TaskA");
			System.out.println("Tick Tick\t"+i+"\t"+Thread.currentThread().getName());
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Ending the TaskA");
		}
	}
	public LoopTaskA() {
		this.id=count++;
		//this.start();
	}

}
