package com.home.sarvesh;

import java.util.Arrays;

public class ArrangeArray {
	public static void main(String[] args) {
//		int[] in = { 2, 4, 6, 7, 9, 12, 13 };
		int[] in = {2,1,3,15,4,7,9,24,98};
		Arrays.sort(in);
		int start = 0;
		int firstEven = 0;
		int last = in.length - 1;
		int[] out = new int[last+1];
		for (int i = 0; i < in.length; i++) {
			int a = in[i];
			if(a==2){
				out[start] = a;
				start++;
				continue;
			}
			if (a % 2 != 0) {
				boolean b = checkPrime(a);
				if (b == true) {
					if (firstEven > 0) {
						int temp = out[firstEven];
						out[firstEven] = a;
						out[start] = temp;
						start++;
						firstEven++;
					} else {
						out[start] = a;
						start++;
					}
				} else {
					out[last] = a;
					last--;
				}
			} else {
				if (firstEven == 0)
					firstEven = start;
				out[start] = a;
				start++;
			}
		}
		System.out.println(Arrays.toString(out));
	}

	public static boolean checkPrime(int a) {
		boolean isPrime = true;
		if(a==1)
			return false;
		int l = (int) Math.sqrt(a);
		for (int i = 2; i <= l; i++) {
			if (a%i == 0)
				return isPrime = false;
		}
		return isPrime;
	}
}
