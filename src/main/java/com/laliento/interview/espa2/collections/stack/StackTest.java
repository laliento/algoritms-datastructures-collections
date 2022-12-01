package com.laliento.interview.espa2.collections.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("lalo");
		stack.push("cz");
		stack.push("laliento");
		
		String itemPeek = stack.peek();
		System.out.println("Objeto extraido sin eliminar: " + itemPeek);
		stack.forEach(System.out::println);
		String itemPop = stack.pop();
		System.out.println("Objeto extraido eliminando: " + itemPop);
		stack.forEach(System.out::println);
		
	}
}
