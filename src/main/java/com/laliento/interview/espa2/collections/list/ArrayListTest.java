package com.laliento.interview.espa2.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	/*
	 * Arreglos dinámicos, es un arreglo común con default capacidad 10
	 * Cuando se añaden más items que pasan la capacidad del arreglo
	 * se crea un nuevo arreglo con un 50% extra de capacidad
	 */
	public static void main(String[] args) {
		List<String> lstStrings = new ArrayList<>();
		lstStrings.add("lalo");
		lstStrings.add("cz");
		lstStrings.add("laliento");
//		removeListIterator(lstStrings);
		removeLambda(lstStrings);
		
		printList(lstStrings);
		
	}

	private static void printList(List<String> lstStrings) {
		ListIterator<String> lstIterator = lstStrings.listIterator();
		while(lstIterator.hasNext()) {
			System.out.println(lstIterator.next());
		}
	}

	private static void removeLambda(List<String> lstStrings) {
		lstStrings.removeIf(item -> item.equals("cz"));
	}

	private static void removeListIterator(List<String> lstStrings) {
		ListIterator<String> lstIterator = lstStrings.listIterator();
		while(lstIterator.hasNext()) {
			if(lstIterator.next().equals("cz"))
				lstIterator.remove();
		}
	}
}
