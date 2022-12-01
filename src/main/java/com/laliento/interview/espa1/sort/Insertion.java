package com.laliento.interview.espa1.sort;

public class Insertion {

	public static void main(String[] args) {
		int []request = {7,2,1,4, 0,5,6,8,2};
		for (int k = 0; k < request.length; k++) {
			System.out.print(request[k] + " ");
		}
		System.out.println();
		
		for (int i = 1; i < request.length; i++) {
			int aux = request[i];
			int j;
			for (j = i; j > 0 && request[j-1] > aux; j--) {
				request[j] = request[j-1];
			}
			request[j] = aux;
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
