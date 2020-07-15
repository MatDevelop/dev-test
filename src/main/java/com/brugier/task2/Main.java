package com.brugier.task2;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
		
		long start = System.currentTimeMillis();
		Arrays.sort(arr);
		
		findPairsWithGivenSum(arr, 13);
		
		long end = System.currentTimeMillis() - start;
		System.out.println("\nCzas wykonania programu: " + end + "ms.");
	}
	
	public static void findPairsWithGivenSum(int[] arr,int sum) {
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] + arr[j] == 13) {
					if(arr[j] < arr[i]) {
						return;
					}
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
}
