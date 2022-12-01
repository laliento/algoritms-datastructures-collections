package com.laliento.interview.espa2.collections.queue.priority;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> priority = new PriorityQueue<>();
		priority.offer(4);
		priority.offer(1);
		priority.offer(8);
		priority.offer(0);
		priority.offer(3);
		priority.offer(2);
		System.out.println("Actual: " + priority);
		
		priority = new PriorityQueue<>(Comparator.reverseOrder());
		priority.offer(4);
		priority.offer(1);
		priority.offer(8);
		priority.offer(0);
		priority.offer(3);
		priority.offer(2);
		
		System.out.println("Actual reverse: " + priority);
	}
}
