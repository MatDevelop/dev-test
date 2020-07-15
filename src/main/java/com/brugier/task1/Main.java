package com.brugier.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.brugier.utils.ListGenerator;

public class Main {

	private static List<Integer> elementsList = new ArrayList<>();
	

	public static void main(String[] args) {

//		int listLength = 20;
//		ListGenerator.fillRandomList(elementsList, listLength);
		
		elementsList.addAll(Arrays.asList(1, 10, 20, 20, 2, 5));

		long start = System.currentTimeMillis();

		elementsList.stream().distinct().sorted().forEach(element -> {
			System.out.print(element + " ");
		});

		System.out.println("\ncount: " + elementsList.size());

		System.out.println("distinct: " + elementsList.stream().distinct().count());
		
		System.out.println("min: " + Collections.min(elementsList));
		
		System.out.println("max: " + Collections.max(elementsList));

		long end = System.currentTimeMillis() - start;
		System.out.println("\nCzas wykonania programu: " + end + "ms.");
	}

	
}
