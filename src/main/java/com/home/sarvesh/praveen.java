package com.home.sarvesh;

public class praveen {

	public static void main(String[] args) {
		System.out.println("hi praveen");
		System.out.println("Hi sarvesh");
		int[] arr = { 70, 69, 49, -28, -16, 79 };
		int N = 6;
		boolean res = findSum(arr, N);
		System.out.println((res==true)? "True": "False");
	}
	
	// check if sum of any three elements is equal to five or not.

	public static boolean findSum(int[] arr, int N) {
		boolean getFive = false;
		if (N < 3)
			return getFive;
		for (int i = 0; i < N - 2; i++) {
			int sum = 0;
			for (int j = i + 1; j < N - 1; j++) {
				sum = arr[i] + arr[j] + arr[j + 1];
				if (sum == 5)
					return true;
			}
		}
		return getFive;
	}
}
