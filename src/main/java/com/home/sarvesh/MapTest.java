package com.home.sarvesh;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "Hi");
		map.put("b", "There");
		Map<String, String> result = mapAB(map);
		for(String s : result.keySet()){
			System.out.println(map.get(s));
		}
	}
	
	public static Map<String, String> mapAB(Map<String, String> map){
		if(map.containsKey("a") && map.containsKey("b")){
			String s = map.get("a") + map.get("b");
			map.put("ab", s);
		}
		return map;
	}
		
}
