package com.laliento.questions.recursion;

public class Q4DecimalToBinary {

	public static void main(String[] args) {
		Q4DecimalToBinary question = new Q4DecimalToBinary();
		int result = question.question(16);
		System.out.println(result);
	}
	
	public int question(int decimal) {
		if(decimal == 0) {
			return 0;
		}
		return decimal%2 + 10*question(decimal/2);
	}
}
