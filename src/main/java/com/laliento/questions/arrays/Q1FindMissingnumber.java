package com.laliento.questions.arrays;

public class Q1FindMissingnumber {

	public static void main(String[] args) {
		Q1FindMissingnumber question = new Q1FindMissingnumber();
		int intArray[] = {1, 2, 3, 4, 5, 6, 7,8, 9, 10,11,12,14};
		
		int result = question.missingNumber(intArray );
		System.out.println("Result:" + result);
		
	}
	
	public int missingNumber(int[] intArray) {
        int sumInput = 0;
        int sumTotal = (intArray.length+1) * (intArray.length +2)/2;
		for (int i : intArray) {
			sumInput += i;
		}
		
		return  sumTotal - sumInput;
    }
}
