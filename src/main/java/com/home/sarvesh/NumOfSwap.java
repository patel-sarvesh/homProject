package com.home.sarvesh;


public class NumOfSwap {
	public static void main(String[] args) {
		int[] userarr = {4,2,1,5,3};
		int[] defualt = new int[userarr.length];
		int temp = 1;
		for(int i=0 ; i<userarr.length ; i++){
			defualt[i] = temp++;
		}
		int count = countSwap(defualt, userarr);
		System.out.println(count);
	}
	
	public static int countSwap(int[] darr , int[] uarr){
		int count =0;
		if(uarr.length < 2)
			return 0;
		for(int i=0 ; i<uarr.length ; i++){
			for(int j=i ; j<uarr.length ; j++){
				if(uarr[i] > darr[j]){
					count += uarr[i] - darr[j];
					break;
				}
			}
		}
		return count;
	}

}
