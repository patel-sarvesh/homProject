package com.home.sarvesh;

import java.util.*;

public class NightmareQuiz {
	public static void main(String[] args) {
		
//		 Scanner sc = new Scanner(System.in);
//	        int tc = sc.nextInt();
//	        while(tc-->0){
//	        	int num = sc.nextInt();
			int num=24;
	       	quiz(num);
//	        }
	    }
	
	public static void quiz(int n){
    	// int count=0;
    	List<Integer> factor = new ArrayList<Integer>();
    	// // List<Integer> nonPrime = new ArrayList<Integer>();
    	// int len =(int) math.sqrt(n);
    	// for(int i=2; i<len; i++){
    	// 	if(n%i==0)
    	// 		nonPrime.add(i);
    	// 	else
    	// 		prime.add(i);
    	// }
    	for(int i=2; i<=n; i++){
    		while(n%i==0){
    			factor.add(i);
    			n=n/i;
    		}
    	}
    	int len = factor.size();
    	if(len==1){
    		System.out.println("1");
    	}
    	else if(len==3){
    			System.out.println("-1");		
    	}
		else if(len>3){
			if(len%2==0)
				System.out.println(len/2);
			else
				System.out.println((len/2)+1);
		}
		else{
			System.out.println("0");
		}
	}
}
