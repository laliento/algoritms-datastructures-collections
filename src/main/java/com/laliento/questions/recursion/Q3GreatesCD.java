package com.laliento.questions.recursion;

public class Q3GreatesCD {

	/*
	 * Given two numbers, find the GRADER COMMON DIVISOR of both
	 */
	public static void main(String[] args) {
		Q3GreatesCD question = new Q3GreatesCD();

		int result = question.divisor(8, 32);
		System.out.println(result);
	}

	public int divisor(int a, int b) {
		if (a < 0 || b < 0) {
			return -1;
		}
		System.out.println("Entrando a: " + a + " b: " + b);
		if (b == 0) {
			return a;
		}
		System.out.println("Enviando b: " + b + " a%b: " + a%b);
		return divisor(b, a % b);
	}

}
