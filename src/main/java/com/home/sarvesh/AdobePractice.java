package com.home.sarvesh;

public class AdobePractice {
	public static void main(String[] args) {
		int[] arr = {0,1,0,0,1,1};				// 0's for building 1's for candy shop.
		int k=2;								// time taken between every building.
		int totalTime = calTime(arr, k);
        System.out.println(totalTime);
	}
	
	// to calculate time taken by girl to reach first two candy shops.
	// as for first shop it always be 1 unit of time.
	
	public static int calTime(int[] arr, int k){
        int sum = 0;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                if(sum==0){
                    sum = 1;
                    temp = i;
                }
                else{
                    sum += k*(i-temp);
                    break;
                }
            }
        }
        return sum;
    }
}
