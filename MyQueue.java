package com.bridgelabz.queue;

import com.bridgelabz.stacknqueue.LinkedList;

public class MyQueue <T> {

//Object of Linked List class to invoke linked List Class Method

LinkedList<T> List = new LinkedList<>();
	
	/**
	 * For Adding Value For Queue by 
	 * Using Linked List class Add method
	 */
	public void enqueue(T data) {
		List.add(data);
	}
	/**
	 * For removing value/data from stack and
	 * queue by using Linked list class method.
	 * @return
	 */
	public int dequeue() {
		return List.pop();
	}
	/**
	 * For Printing purpose of Data in queue
	 */
	public void show() {
		List.show();
	}
	
}


