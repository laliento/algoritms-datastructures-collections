package com.laliento.interview.espa2.collections.queue.deque;

import java.util.Stack;

public class DequeTest {

	static Stack<String> actions = new Stack<>();
	static Stack<String> buffer = new Stack<>();

	public static void main(String[] args) {
		addAction("a");
		addAction("b");
		addAction("c");
		addAction("d");
		addAction("e");
		undo();
		undo();
		undo();
		rendo();
		rendo();
		undo();
		rendo();
	}
	
	private static void addAction(String action) {
		System.out.println("Adding: " + action);
		actions.push(action);
		printCurrent();
	}
	
	private static void undo() {
		String undoAction = actions.pop();
		System.out.println("Undo action: " + undoAction);
		buffer.push(undoAction);
		printCurrent();
	}
	
	private static void rendo() {
		String rendoAction = buffer.pop();
		System.out.println("Rendo action: " + rendoAction);
		addAction(rendoAction);
	}
	
	private static void printCurrent() {
		System.out.println(actions);
	}
}
