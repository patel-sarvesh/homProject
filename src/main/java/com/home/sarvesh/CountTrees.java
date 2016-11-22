package com.home.sarvesh;

import java.util.*;

public class CountTrees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        char[] vow = {'A','E','I','O','U','a','e','i','o','u'};
		HashMap<Integer, Character> vowel = new HashMap<Integer, Character>();
		for(int i=0; i<vow.length; i++){
			vowel.put(i, vow[i]);
		}
        while(cases-->0){
        	String in = sc.nextLine();
        	int badTrees = vowelTree(in, vowel);
        	System.out.println(badTrees);
        }
        sc.close();
    }
    
    public static int vowelTree(String s, HashMap<Integer,Character> vowel){
    	int count = 0;
    	char[] ch = s.toCharArray();
    	for(int i=0; i<ch.length; i++){
    		if(vowel.containsValue(ch[i]))
    			count++;
    	}
    	return count;
	}

}
