package com.home.sarvesh;

import java.util.Arrays;

public class SortingMethods {

	public static void main(String[] args) {
		int[] arr = {11,9,7,6,12,14};
//		bubbleSort(arr);
		quickSort(arr , 0 , arr.length-1);
//		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		}

	// using bubble sort algorithm.
	public static int[] bubbleSort(int[] arr) {
		if (arr.length <= 1)
			return arr;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 1; i < arr.length-j; i++) {
				if (arr[i] < arr[i - 1]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
			}
		}
		return arr;
	}
	
	// using quick sort algorithm
	public static void quickSort(int[] arr, int start ,int end){
		int i = start;
		int j = end;
		int pivot = arr[i + (j-i)/2];
		while(i<=j){
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i<=j){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j--;
			}
		}
		// to run the rest value of array we called recursive method.  
		if(i < end)
			quickSort(arr , i , end);
		if(j > start)
			quickSort(arr , start , j);
	}
	
	//  using merge Sort algorithm
	public static int[] mergeSort(int[] arr){
		if(arr.length <= 1)
			return arr;
		
		int[] leftarr =  new int[arr.length/2];
		int[] rightarr =  new int[arr.length - leftarr.length];
		
//		System.arraycopy(arr, 0, leftarr, 0, leftarr.length);	  // same method using different approach.
		leftarr = Arrays.copyOfRange(arr, 0, leftarr.length);    // Arrays method to copy in array from other array.
		System.arraycopy(arr, leftarr.length, rightarr, 0, rightarr.length);
		
		mergeSort(leftarr);
		mergeSort(rightarr);
		
		merge(leftarr , rightarr , arr);
		return arr;
	}
	public static void merge(int[] larr , int[] rarr , int[] result){
		int i=0 , j=0 , k=0;
		while(larr.length > i && rarr.length > j){
			if(larr[i] < rarr[i]){
				result[k] = larr[i];
				i++;
			}
			else{
				result[k] = rarr[j];		
				j++;
			}
			k++;
		}
		System.arraycopy(larr, i, result, k, larr.length-i);
		System.arraycopy(rarr, j, result, k, rarr.length-j);
	}
}
