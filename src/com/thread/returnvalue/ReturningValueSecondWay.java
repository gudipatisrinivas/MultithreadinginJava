package com.thread.returnvalue;

public class ReturningValueSecondWay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String curretThreadName = Thread.currentThread().getName();
		System.out.println("Current ThreadName" + curretThreadName + "Main ThreadStarts here");
		ReturningValueFromTaskB task1 = new ReturningValueFromTaskB(2, 3, 2000,new ListenerImplementor("Task-1"));
		Thread t1 = new Thread(task1, "Thread-1");

		ReturningValueFromTaskB task2 = new ReturningValueFromTaskB(4, 5, 500,new ListenerImplementor("Task-2"));
		Thread t2 = new Thread(task2, "Thread-2");
		// t2.start();

		ReturningValueFromTaskB task3 = new ReturningValueFromTaskB(9, 8, 200,new ListenerImplementor("Task-3"));
		Thread t3 = new Thread(task3, "Thread-3");

		t1.start();
		
		
		t1.join();
		System.out.println("Result -1 " + task1.getListener().getSumOfValue());
		t2.start();
		t2.join();
		Thread.sleep(500);
		System.out.println("Result -2 " + task2.getListener().getSumOfValue());
		t3.start();
		t3.join();
		Thread.sleep(500);
		System.out.println("Result -3 " + task3.getListener().getSumOfValue());
		
		
		
		System.out.println("Current ThreadName" + curretThreadName + "Main Ends here");

	}

}
