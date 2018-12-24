/**
 * 
 */
package com.threads.basics;

/**
 * @author test
 *
 */
public class Firstway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FirstTask().setName("Srinivas");
		Thread t=new FirstTask();
		t.setName("Mounika");

	}

}
class FirstTask extends Thread{	
	private static int count=0;
	private int id;
	
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Tick Tick\t"+i+"\t"+this.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public FirstTask() {
		this.id=count++;
		this.start();
	}
}
