package com.laliento.questions.arrays;

public class Q3MaxProduct {

	public static void main(String[] args) {
		Q3MaxProduct question = new Q3MaxProduct();
		String result = question.maxResult(new int[] {7,1,2,3,4,0,9,1,9});
		System.out.println("Result: " + result);
	}
	
	public String maxResult(int[] request) {
		int max =0;
		int nearMax =0;
		for(int i = 0; i < request.length; i++) {
			if(request[i]> max) {
				nearMax = max;
				max = request[i];
			}
			if(request[i] != max && request[i] > nearMax) {
				nearMax=request[i];
			}
		}
		return "("+max+","+nearMax+")";
	}
}
