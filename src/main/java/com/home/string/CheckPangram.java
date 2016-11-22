package com.home.string;


import java.util.Scanner;

public class CheckPangram {
	public static void main(String[] args) {
		CheckPangram ob = new CheckPangram();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		sc.close();
		Boolean result = ob.pangram(s);
		System.out.println(result);
	}

	public boolean pangram(String s){
		boolean isPangram = true;
		String alphabate = "abcdefghijklmnopqrstuvwxyz";
		char[] alph = alphabate.toCharArray();
		for(int i=0 ; i<alphabate.length() ; i++){
			if(s.toLowerCase().contains(Character.toString(alph[i])))
				continue;
			else
			{
				isPangram = false;
				break;
			}
		}
		return isPangram;
	}
}
