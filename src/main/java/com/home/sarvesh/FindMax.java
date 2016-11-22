package com.home.sarvesh;

public class FindMax {
	public static void main(String[] args) {
		int[] arr = {1,2,-4,23,-25,30,55,12,99};
		int max = findMaxInArray(arr);
		System.out.println(max);
	}
	
	public static int findMaxInArray(int[] arr){
		int max = 0;
		int secondMax = 0;
		for(int i=0; i<arr.length ; i++){
			if(arr[i] > max){
				secondMax = max;
				max=arr[i];
			}
			else if(secondMax < arr[i]){
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
		return max;
	}

}
