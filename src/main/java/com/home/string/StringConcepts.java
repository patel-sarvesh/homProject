package com.home.string;

public class StringConcepts {

	public static void main(String[] args) {
		String s = "hello myself sarvesh";
		String num = "123";
		numOfCharacter(s);
		convertStringIntoInteger(num);
		swapString();
		
	}
	
	/* count the total number of occurrences of a given character in a string
	 without using any loop */
	
	public static void numOfCharacter(String s){
		String alphabate = "a";
		int occurrence = s.length() - (s.replaceAll(alphabate, "").length());
		System.out.println(occurrence);
	}
	
	
	// to convert string into integer and its exception
	
	public static void convertStringIntoInteger(String num){
		try {
			int con = Integer.valueOf(num);
			System.out.println(con);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// swapping between two string without using 3rd variable 
	
	public static void swapString(){
		String s1 = "sarvesh";
		String s2 = "praveen";
		s1 += s2;
		s2 = s1.substring(0, (s1.length()-s2.length()));
		s1 = s1.substring(s2.length());
		System.out.println(s1 +"======"+s2);
		
	}
}
