package com.home.sarvesh;

import java.util.Arrays;

public class FindCost {
	public static void main(String[] args) {
		int[] arr = { 10, 7, 5, 8, 11, 9 };
		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		int c = maxCost(arr);
		System.out.println(c);

	}

	/// method to find minimum cost or difference between elements of array ///

	public static int minCost(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				return count;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			if (count == 0) {
				count = diff;
			} else if (count > diff) {
				count = diff;
			}
		}
		return count;
	}

	/// method to find maximum cost or difference between elements of array ///

	public static int maxCost(int[] arr) {
		int cost = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int difference = arr[j] - arr[i];
					if (cost < difference)
						cost = difference;
				}
			}
		}

		return cost;
	}

}
