package com.home.sarvesh;


public class XORMad {
	public static void main(String[] args) {
		int input = 4;
		int count = calculate(input);
		System.out.println(count);
	}

	// to find count how many number are follow this condition
	// i<input , i^input == i+ input;
	// xor example

	public static int calculate(int a) {
		int count = 0;
		for (int i = a - 1; i > 0; i--) {
			int temp = i ^ a;
			if (temp == a + i) {
				count++;
			}
		}
		return count;
	}

}
