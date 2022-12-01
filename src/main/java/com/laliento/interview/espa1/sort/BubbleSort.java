package com.laliento.interview.espa1.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] request = { 3, 5, 8, 9, 1, 0 , -1, -10};
		for (int i = 0; i < request.length; i++) {
			System.out.print(request[i] + " ");
		}
		System.out.println();
		for (int j = request.length; j > 0; j--) {
			for (int i = 0; i < j - 1; i++) {
				if (request[i] > request[i + 1]) {
					int max = request[i];
					request[i] = request[i + 1];
					request[i + 1] = max;
				}
			}
			for (int k = 0; k < request.length; k++) {
				System.out.print(request[k] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < request.length; i++) {
			System.out.print(request[i] + " ");
		}
	}
}
