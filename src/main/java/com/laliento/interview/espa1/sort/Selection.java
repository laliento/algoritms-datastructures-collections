package com.laliento.interview.espa1.sort;

public class Selection {

	public static void main(String[] args) {
		int []request = {1,6,2,-1, 8,4,0};
		for (int k = 0; k < request.length; k++) {
			System.out.print(request[k] + " ");
		}
		System.out.println();
		for (int i = 0; i < request.length ; i++) {
			int minPos =i;
			boolean found = false;
			for (int j = i +1; j <  request.length; j++) {
				if(request[j] < request[minPos]) {
					minPos =  j;
					found = true;
				}
			}
			if(found) {
				int aux = request[i];
				request[i] = request[minPos];
				request[minPos] = aux;
				for (int k = 0; k < request.length; k++) {
					System.out.print(request[k] + " ");
				}
				System.out.println();
			}
		}
		for (int i = 0; i < request.length; i++) {
			System.out.print(request[i] + " ");
		}
	}
}
