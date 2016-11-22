package com.home.string;

public class FindKthChar {
	public static void main(String[] args) {
		String s = "ab4c2ed3";
		int k =9;
		char c = findChar(s, k);
		System.out.println(c);
	}
	
	public static char findChar(String s, int k){
		if(s==null)
			return 0;
		char c = 0;
		String temp = "";
		String str = "";
		String fn = "";
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(!Character.isAlphabetic(ch)){
				temp += ch;  
			}
			else{
				str +=ch;
			}
			if(temp.length()>0 && str.length()>0){
				for(int j=0; j<Integer.valueOf(temp); j++){
					fn += str;
				}
				str = "";
				temp = "";
			}
		}
//		System.out.println(fn);
		c = fn.charAt(k-1);
		return c;
	}

}
