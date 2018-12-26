package com.thread.returnvalue;

public class ListenerImplementor implements ResultListener<Integer> {
	private String taskId;
	private int result;
	
	public ListenerImplementor(String taskId) {
		super();
		this.taskId = taskId;
	}

	@Override
	public void notifyListener(Integer result) {
		// TODO Auto-generated method stub
		this.result=result;
		//System.out.println("Result for "+taskId+"Result"+result);
		
	}

	@Override
	public int getSumOfValue() {
		// TODO Auto-generated method stub
		return result;
	}


}
