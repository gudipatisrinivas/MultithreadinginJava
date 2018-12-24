/**
 * 
 */
package com.threads.basics;

/**
 * @author test
 *
 */
public class ThirdWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 =new Thread( new ThirdTask());
		t1.setName("Srinivas");
		t1.start();
		Thread t = new Thread(new ThirdTask());
		t.setName("Mounika");
		t.start();

	}

}
class ThirdTask implements Runnable{	
	private static int count=0;
	private int id;
	
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Tick Tick\t"+i+"\t"+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public ThirdTask() {
		this.id=count++;
		//this.start();
	}
}
