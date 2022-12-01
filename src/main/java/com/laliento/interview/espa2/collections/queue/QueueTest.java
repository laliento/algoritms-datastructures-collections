package com.laliento.interview.espa2.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> normalQueue = new LinkedList<>();
		normalQueue.offer(1);
		normalQueue.offer(2);
		normalQueue.offer(3);
		normalQueue.offer(4);
		
		Integer intPeek = normalQueue.peek();
		System.out.println("Item fuera sin eliminar: " + intPeek);
		normalQueue.forEach(System.out::println);
		Integer intPoll = normalQueue.poll();
		System.out.println("Item fuera y eliminado: " + intPoll);
		normalQueue.forEach(System.out::println);
	}
}
