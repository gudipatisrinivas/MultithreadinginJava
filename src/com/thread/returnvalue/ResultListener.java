package com.thread.returnvalue;

public interface ResultListener<T> {
	void notifyListener(T result);
	int  getSumOfValue();

}
