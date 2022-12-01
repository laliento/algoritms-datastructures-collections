package com.laliento.questions.recursion;

public class Q1FindSumOfDigits {

	public static void main(String[] args) {
		Q1FindSumOfDigits questions = new Q1FindSumOfDigits();
		int result = questions.q1SumMethod(119);
		System.out.println(result);
	}
	
	public int q1SumMethod(int item) {
//		System.out.println("Enter--> " + item);
		if(item <= 0) return 0;
		return item%10 + q1SumMethod(item/10);
	}
}
