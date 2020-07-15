package com.brugier.task3;

public class Main {
	
	private static int count = 0;

	public static void main(String[] args) {
		int n = 3;
		int[][] arr = new int[n][2];
		
		arr[0][0] = 1; arr[0][1] = 2;
		arr[1][0] = 2; arr[1][1] = 3;
		arr[2][0] = 5; arr[2][1] = 6;
		
		countSeparatedGraphs(arr, n);
		
		System.out.println(count);
	}
	
	public static void countSeparatedGraphs(int[][] arr, int n) {
		int to;
		to = arr[0][1];
		count++;
		for(int i = 0; i < n-1; i++) {
			if(arr[i+1][0] == to) {
				to = arr[i+1][1];
			}else {
				to = arr[i+1][1];
				count++;
			}
		}
	}

}
