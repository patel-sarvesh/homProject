package com.home.sarvesh;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// sumarr();
		// printPattern1();
		// sumOfValue();

//		int N = 7;
		int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
		int sum = sumOfValue(arr);
		System.out.println(sum);
	}

	/// sum of array elements in n/2 time complexity ///

	public static void sumarr() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0, j = arr.length - 1; j > i; i++, j--)
			sum += (arr[i] + arr[j]);

		if (arr.length % 2 != 0)
			sum += arr[arr.length / 2];

		System.out.println(sum);

	}

	/// print pattern with given number ///

	public static void printPattern() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j >= (n - i))
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	// print pattern of square of given number using * and #;
	
	public static void printPattern1() {
		int N = 5;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j <= i)
					System.out.print("*");
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

	// method to find max sum and min sum by replacing value of 5 with 6 and vice versa.
	
	public static void sum() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split("\\s+");
		String first = arr[0];
		String second = arr[1];
		// String second =String.valueOf(sc.nextInt());
		sc.close();
		first = first.replaceAll("6", "5");
		second = second.replaceAll("6", "5");
		int minSum = Integer.parseInt(first) + Integer.parseInt(second);

		first = first.replaceAll("5", "6");
		second = second.replaceAll("5", "6");
		int maxSum = Integer.parseInt(first) + Integer.parseInt(second);

		System.out.println(minSum + " " + maxSum);
	}
	
	// to find out sum of different between elements having prime number gap between index of elements.
	// i-j should be prime number.

	public static int sumOfValue(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 2; j < arr.length; j++) {
				int temp = j - i;
				if (temp == 2 || temp == 3 || temp == 5 || temp == 7) {
					sum += Math.abs(arr[j] - arr[i]);
				} else if (temp > 10) {
					boolean isPrime = true;
					int len = (int) Math.sqrt(temp);
					System.out.println(temp);
					for (int k = 2; k <= len; k++) {
						if (temp % k == 0) {
							isPrime = false;
							break;
						}
					}
					if (isPrime == true) 
						sum += Math.abs(arr[j] - arr[i]);
				}
			}
		}
		return sum;
	}
}
