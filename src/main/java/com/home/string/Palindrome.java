package com.home.string;

public class Palindrome{
	public static void main(String[] args){
		String s = "cjcknkkaababaasjacnkjnc";
		String str = longestPalindrome(s);
		System.out.println(str);
//		Palindrome ob = new Palindrome();
//		String revStr = ob.reverse(s);
//		System.out.println(revStr);
//		if(s.equalsIgnoreCase(revStr)){
//			System.out.println("Strng is Palindrome ");
//		}
//		else{System.out.println("not Palindrome");}
	}
	public String reverse(String s){
		StringBuilder revStr = new StringBuilder();
		for(int i=s.length()-1 ; i>=0 ; i--){
			revStr.append(s.charAt(i));
			
		}
		System.out.println(revStr);
		return revStr.toString();
	}
	
	public static String longestPalindrome(String s){
		if(s.isEmpty())
			return null;
		if(s.length()==1)
			return s;
		
		String longest = s.substring(0, 1);
		for(int i=0; i<s.length(); i++){
			String temp = helper(s , i , i);
			if(longest.length() < temp.length())
				longest = temp;
			temp = helper(s , i, i+1);
			if(longest.length() < temp.length())
				longest = temp;
		}
		return longest;
	}
	
	public static String helper(String s ,int b ,int e){
		while(b >= 0 && e < s.length() && s.charAt(b) == s.charAt(e)){
			b--;
			e++;
		}
		return s.substring(b+1, e);
	}
}