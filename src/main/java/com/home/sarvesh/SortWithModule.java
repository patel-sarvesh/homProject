package com.home.sarvesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortWithModule {
	public static void main(String[] args) {
		int[] arr = { 12, 18, 17, 65, 46 };
		int k = 6;
		int[] sortedArray = mapSort(arr, k);
		System.out.println(Arrays.toString(sortedArray));
	}

	// sort array based on their remainders using map interface //
	
	public static int[] mapSort(int[] input, int k){
		Map<Integer , Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0 ; i<input.length ; i++){
			map.put(input[i], input[i]%k);
		}
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> ob1, Map.Entry<Integer, Integer> ob2){
				return (ob1.getValue()).compareTo(ob2.getValue());
			}
		});
//		System.out.println(list);
		int i=0;
		for(Map.Entry<Integer, Integer> res : list){
			input[i] = res.getKey();
			i++;
		}
		return input;
}
}