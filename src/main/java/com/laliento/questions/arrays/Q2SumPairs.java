package com.laliento.questions.arrays;

public class Q2SumPairs {

	public static void main(String[] args) {
		Q2SumPairs question = new Q2SumPairs();
		
		int[] result = question.findPairs(new int[] {1,2,4,5}, 5);
		System.out.println("Result: " +result[0] + ","+result[1]);
	}
	
	public int[] findPairs(int[] request, int tarjet) {
		for (int i = 0; i < request.length; i++) {
			for (int j = i+1; j < request.length; j++) {
				if(request[i] +  request[j] == tarjet) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No solution found!");
	}
}
