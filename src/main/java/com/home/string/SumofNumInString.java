package com.home.string;

public class SumofNumInString {
	public static void main(String[] args) {
		String s ="1abc23";
		int val = sum(s);
		System.out.println(val);
	}
	
	public static int sum(String s){
		String temp ="";
		int add = 0;
		for(int i=0; i<s.length(); i++){
			if(!Character.isAlphabetic(s.charAt(i))){
				temp += s.charAt(i);
			}
			else if(temp.length()>0){
				add += Integer.valueOf(temp);
				temp = "";
			}
		}
		add += Integer.valueOf(temp);
		return add;
	}
	
}
