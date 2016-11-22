package com.home.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "abcdgabxeahjkblmnopa";
		longestSubstring(s);
//		 String str = longString(s);
//		 System.out.println(str);
	}

	/// using String ////
	
	public static String longString(String s){
		if(s==null)
			return s;
		String str = "";
		char[] ch = s.toCharArray();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<ch.length; i++){
			if(!str.contains(String.valueOf(ch[i]))){
				str += ch[i];  
			}
			else{
				list.add(str);
//				int a =s.indexOf(ch[i])+1;
				i = s.indexOf(ch[i])+1;
//				i=a;
				str="";
				str=String.valueOf(ch[i]);
			}
		}
		list.add(str);
		String re=Collections.max(list);
		return re;
	}
	
		////using LinkedHashMap ////
	
	    static void longestSubstring(String inputString)
	    {
	        char[] charArray = inputString.toCharArray();
	        String longestSubstring = null;
	        int longestSubstringLength = 0;
	        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            char ch = charArray[i];
	            if(!charPosMap.containsKey(ch))
	            {
	                charPosMap.put(ch, i);
	            }
	            else
	            {    
	                i = charPosMap.get(ch);
	                charPosMap.clear();
	            }
	            if(charPosMap.size() > longestSubstringLength)
	            {
	                longestSubstringLength = charPosMap.size();
	                longestSubstring = charPosMap.keySet().toString();
	            }
	        }
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("The longest substring : "+longestSubstring.replaceAll(", ", ""));
	         
	        System.out.println("The longest Substring Length : "+longestSubstringLength);
	    }

}
