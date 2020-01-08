package com.e2eproject.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class Iterationmethods {
	// Iterable.forEach method (Java 8)
	@Test
	public void iterateforeach() {
		Collection<String> collection = Arrays.asList("How", "How","To", "Iterate", "In", "Java");

		collection.forEach(s -> System.out.println(s));

	}

	// Java “foreach” loop (Java 5)
	@Test
	public void ex2() {
		Collection<String> collection = Arrays.asList("How", "To", "Iterate", "In", "Java");

		for (String s : collection) {
			System.out.println(s);
		}
	}

	@Test
	public void ex3() {
		Collection<String> collection = Arrays.asList("How", "To", "Iterate", "In", "Java");

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Test
	public void ex4() {
		List<String> list = Arrays.asList("How", "To", "Iterate", "In", "Java");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
