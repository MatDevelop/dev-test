package com.brugier.utils;

import java.util.List;
import java.util.Random;

public class ListGenerator {
	
	public static void fillRandomList(List<Integer> elementsList, int listLength) {
		Random random = new Random();
		for (int i = 0; i < listLength; i++) {
			elementsList.add(random.nextInt(50) + 1);
		}
	}
}
