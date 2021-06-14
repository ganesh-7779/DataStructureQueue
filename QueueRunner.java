package com.bridgelabz.queue;


public class QueueRunner {

	public static void main(String[] args) {
		MyQueue<Integer> List = new MyQueue<Integer>();
		List.enqueue(56);
		List.enqueue(70);
		List.enqueue(30);
		List.show();
		System.out.println("Before removing ");
		System.out.println();
		List.dequeue();
		System.out.println("After removing");
		List.show();
}
}