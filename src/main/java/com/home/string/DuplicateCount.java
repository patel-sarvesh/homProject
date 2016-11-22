package com.home.string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateCount {
	public static void main(String[] args) {
		String s = "SARVESH sin  gh";
		LinkedHashMap<Character, Integer> result = findDuplicate(s);
		for(Entry<Character, Integer> map: result.entrySet()){
//			if(map.getValue()>1){
				System.out.println(map);
//			}
		}
	}
	
	public static LinkedHashMap<Character, Integer> findDuplicate(String s){
		s = s.toLowerCase().replaceAll(" ", "");
		System.out.println(s);
//		s = s.replaceAll("\\s", ""); show
		char[] ch = s.toCharArray();
		LinkedHashMap<Character, Integer> count = new LinkedHashMap<>();
		for(int i=0; i<ch.length ; i++){
			if(count.containsKey(ch[i])){
				count.put(ch[i], count.get(ch[i])+1);
			}
			else{
				count.put(ch[i], 1);
			}
		}
		return count;
	}
}
