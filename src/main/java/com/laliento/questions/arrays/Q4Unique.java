package com.laliento.questions.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q4Unique {

	public static void main(String[] args) {
		Q4Unique question = new Q4Unique();
		boolean result = question.isUnique(new int[] {1,2,5,6});
		System.out.println("Result:" + result);
	}
	
	public boolean isUnique(int[] request) {
//		for(int i = 0; i < request.length;i++) {
//			for (int j = i+1; j < request.length; j++) {
//				if(request[i] == request[j]){
//					return false;
//				}
//			}
//		}
//		return true;
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i = 0; i < request.length;i++) {
			if(!mp.containsKey(request[i])) {
				mp.put(request[i], 1);
			}else {
				return false;
			}
		}
		return true;
	}
}
