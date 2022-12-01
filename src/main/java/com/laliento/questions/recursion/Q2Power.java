package com.laliento.questions.recursion;

public class Q2Power {

	/*
	 * Calculate power of a number using recursion
	 */
	public static void main(String[] args) {
		Q2Power pow = new Q2Power();
		int result = pow.power(-2, 3);
		System.out.println(result);
	}
	
	
	public int power(int base, int expo) {
		if(expo < 0) return -1;
		if(expo == 1) return base;
		return base *  power(base, expo-1);
	}
	
}
