package com.laliento.questions.arrays;

public class Q5Permutation {

	public static void main(String[] args) {
		Q5Permutation question = new Q5Permutation();
		boolean result = question.permutation(new int[] {1,3,5,6}, new int[] {3,4,6,1});
		System.out.println("Result:" + result);
	}
	
	public boolean permutation(int[] request1, int[] request2) {
		if(request1.length != request2.length) {
			return false;
		}
		int sum1 = 0;
		int sum2 = 0;
		int mul1 = 1;
		int mul2 = 1;
		for (int i = 0; i < request2.length; i++) {
			sum1+=request1[i];
			sum2+=request2[i];
			
			mul1*=request1[i];
			mul2*=request2[i];
		}
		return sum1==sum2 && mul1==mul2;
	}
}
