package com.home.sarvesh;

public class CheckIntegerPalindrome {
	public static void main(String[] args) {
		int a = 121;
		boolean res = isPalindrome(a);
		System.out.println(res);
	}

	// method to check Integer is Palindrome or not.
	
	public static boolean isPalindrome(int a) {
		boolean check = false;
		String s = String.valueOf(a);
		StringBuilder sb = new StringBuilder(s).reverse();
		if(s.equals(sb.toString())){
			check=true;
		}
		else{
			return check;
		}
		return check;
	}
}
