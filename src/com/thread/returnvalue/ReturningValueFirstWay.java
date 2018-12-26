package com.thread.returnvalue;

public class ReturningValueFirstWay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String curretThreadName = Thread.currentThread().getName();
		System.out.println("Current ThreadName" + curretThreadName + "Main ThreadStarts here");
		ReturningValueFromTaskA task1 = new ReturningValueFromTaskA(2, 3, 2000);
		Thread t1 = new Thread(task1, "Thread-1");

		ReturningValueFromTaskA task2 = new ReturningValueFromTaskA(4, 5, 500);
		Thread t2 = new Thread(task2, "Thread-2");
		// t2.start();

		ReturningValueFromTaskA task3 = new ReturningValueFromTaskA(9, 8, 200);
		Thread t3 = new Thread(task3, "Thread-3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("Result -1 " + task1.getSum());
		System.out.println("Result -2 " + task2.getSum());
		System.out.println("Result -3 " + task3.getSum());
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Current ThreadName" + curretThreadName + "Main Ends here");

	}

}
