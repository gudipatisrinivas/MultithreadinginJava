package com.thread.common;

public class LoopTaskC implements Runnable {
	private static int count=0;
	private int id;
	
	public  synchronized void run() {
		for(int i=10;i>0;i--) {
			//System.out.println("Starting the TaskC");
			System.out.println(Thread.currentThread().getName()+"\tTick Tick\t"+i+"\t");
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Ending "+Thread.currentThread().getName()+" is Alive  :"+Thread.currentThread().isAlive());
		}
	}
	public LoopTaskC() {
		this.id=count++;
		//this.start();
	}

}
