package com.home.sarvesh;

import java.util.*;
import java.util.Map.Entry;

public class MapComparator {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "c");
		map.put(50, "f");
		map.put(10, "z");
		map.put(1, "a");
		map.put(20, "a");
		map.put(2, "o");
		
		List<Entry<Integer, String>> sortMap = mapSort(map);
		System.out.println(sortMap);
		for(Map.Entry<Integer, String> result : sortMap){
			System.out.println(result.getKey() + "------" + result.getValue());
		}
	}
	
	public static List<Entry<Integer, String>> mapSort(Map<Integer, String> map){
		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
			public int compare(Entry<Integer, String> ob1, Entry<Integer, String> ob2){
				return (ob1.getValue()).compareTo(ob2.getValue());
			}
		});
			return 	list;
	}

}
