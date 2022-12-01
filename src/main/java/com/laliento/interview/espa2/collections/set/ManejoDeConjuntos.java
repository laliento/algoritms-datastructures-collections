package com.laliento.interview.espa2.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ManejoDeConjuntos {

	public static void main(String[] args) {
		Set<Integer> stA = new HashSet<>();
		stA.add(1);
		stA.add(2);
		stA.add(3);
		stA.add(4);
		Set<Integer> stB = new HashSet<>();
		stB.add(1);
		stB.add(2);
		stB.add(5);
		stB.add(6);
		
		Set<Integer> union = new HashSet<Integer>(stA);
		union.addAll(stB);
		System.out.println("Unión: " + union);
		
		Set<Integer> intersection = new HashSet<Integer>(stA);
		intersection.retainAll(stB);
		System.out.println("Intersection: " + intersection);
		
		Set<Integer> difference = new HashSet<Integer>(stA);
		difference.removeAll(stB);
		System.out.println("Difference: " + difference);
		
	}
}
