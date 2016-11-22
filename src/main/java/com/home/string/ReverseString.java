package com.home.string;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String s = "(sarv)esh";
		char[] ch = s.toCharArray();
		int len = ch.length;
		for(int i=0; i<len; i++,len--){
			if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[len])){
				char temp = ch[i];
				ch[i] = ch[len];
				ch[len] = temp;
			}
		}
		
		System.out.println(Arrays.toString(ch));
	}
}
