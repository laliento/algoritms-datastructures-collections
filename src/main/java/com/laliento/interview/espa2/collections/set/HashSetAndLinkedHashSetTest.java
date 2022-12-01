package com.laliento.interview.espa2.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetAndLinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> stHashSet = new HashSet<>();
		stHashSet.add("lalo");
		stHashSet.add("laliento");
		stHashSet.add("laliento");
		stHashSet.add("cz");
		stHashSet.add("lalu");
		stHashSet.add("al");
		stHashSet.add("cosa");
		stHashSet.add("cz");
		stHashSet.add("ti");
		
		Set<String> stLinkedHashSet = new LinkedHashSet<>();
		stLinkedHashSet.add("lalo");
		stLinkedHashSet.add("laliento");
		stLinkedHashSet.add("laliento");
		stLinkedHashSet.add("cz");
		stLinkedHashSet.add("lalu");
		stLinkedHashSet.add("al");
		stLinkedHashSet.add("cosa");
		stLinkedHashSet.add("cz");
		stLinkedHashSet.add("ti");
		
		System.out.println("HashSet (tabla de hash por posición, no orden): " + stHashSet);
		System.out.println("LinkedHashSet (Lista enlazada, orden de inserción): " + stLinkedHashSet);
		
	}
}
