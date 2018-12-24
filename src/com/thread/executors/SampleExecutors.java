package com.thread.executors;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

class  Employee implements Callable<Employee>{
	private int i;
	private String name;
	private String lastName;
	
	@Override
	public String toString() {
		return "Employee [i=" + i + ", name=" + name + ", lastName=" + lastName + "]";
	}
	public Employee() {
		this(10,"Mounika","Machiraju");
	}
	public Employee(int i, String name, String lastName) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.name=name;
		this.lastName=lastName;
	}

	@Override
	public Employee call() throws Exception {
		// TODO Auto-generated method stub
		return new Employee(10,"Srinivas","Gudipati");
	}
	
} 

public class SampleExecutors {
	
		public static void main(String[] s) {
		ExecutorService ex=Executors.newCachedThreadPool();
		Future<Employee> fx=ex.submit(new Employee());
		try {
			System.out.println(fx.get().toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Runnable> listOfRun=ex.shutdownNow();
		listOfRun.forEach(item->System.out.println("??"+item));
		
	}

}
