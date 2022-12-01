package com.laliento.questions.arrays;

import java.util.Arrays;

public class Q6RotateMatrix {

	public static void main(String[] args) {
		Q6RotateMatrix question = new Q6RotateMatrix();
		int[][] request = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] request = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(Arrays.deepToString(request));
		question.rotateMatrix(request);
		System.out.println(Arrays.deepToString(request));
	}
	
	public void rotateMatrix(int[][] request){
		int l=0,r=request.length-1;
		while(l<r) {
			for (int i = 0; i < r-l; i++) {
				int top = l;
				int botton = r;
				int topLeft = request[top][l+i];
				
				//move botton left to top left
				request[top][l+i] = request[botton-i][l];
				//move booton right ti botton left
				request[botton-i][l] = request[botton][r-i];
				//move top right to botton left
				request[botton][r-i] = request[top+i][r];
				//move top left to top right
				request[top+i][r] = topLeft;
			}
			r--;
			l++;
		}
	}
}
