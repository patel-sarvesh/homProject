package com.home.sarvesh;

import java.util.Arrays;

public class ChangeNumber {
	public static void main(String[] args) {
		int a = 162;
		int res = countNumOfChange(a);
		System.out.println(res);
	}
	
	/// count number of times of reduction to make all digit same.
	/// eg, input 121 and output 1 as in 121 only 2 is reduce by 1 in one time to make input 111(all digit same).  
	
	public static int countNumOfChange(int a){
		String in = String.valueOf(a);
		char[] ch = in.toCharArray();
		Arrays.sort(ch);
		int minValue = Integer.parseInt(String.valueOf(ch[0]));
		int multiple = minValue*ch.length;
		int sumOfDigits = 0;
		for(char c : ch){
			sumOfDigits += Integer.parseInt(String.valueOf(c));
		}
		return sumOfDigits-multiple;
	}

}
