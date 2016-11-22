package com.home.sarvesh;
import java.util.*;
public class CircularDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 2;
		List<Integer> list = new ArrayList<>();
		int len = 0;
//		System.out.println(len);
		while(N-->0){
			int l = sc.nextInt();
			int r = sc.nextInt();
			list.add(l);
			list.add(r);
		}
		
		for(int i=0; i<list.size(); i+=2){
    		int gap =(int) list.get(i+2)-list.get(i);
    		System.out.println(gap);
    		len = 5+gap;
    	}
		System.out.println(len);
		System.out.println(list);
	}
}
