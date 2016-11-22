package com.home.sarvesh;

public class SumOfTriplets {
	public static void main(String[] args) {
		int N =150;
		int[] input = new int[N];
		for(int i=0 ; i<150 ; i++){
			input[i] = (int) (Math.random()*10);
		}
		calculateTriplets(input);
	}

	public static void calculateTriplets(int[] input) {
		if (input.length <= 100 && input.length>2) {
			long sum = 0L;
			for (int i = 0; i < input.length - 2; i++) {
				for (int j = 1; j < input.length - 1; j++) {
					for (int k = 2; k < input.length; k++) {
						if (k > j && j > i) {
							int addition = input[i] + input[j] + input[k];
							int multiply = input[i] * input[j] * input[k];
							if (multiply > 0) {
								sum += (addition / multiply);
							}
						}
					}
				}
			}
			System.out.println(sum);
		}
		else{
			double sum = 0f;
			long plus =0L;
			for (int i = 0; i < input.length - 2; i++) {
				for (int j = 1; j < input.length - 1; j++) {
					for (int k = 2; k < input.length; k++) {
						if (k > j && j > i) {
							int addition = input[i] + input[j] + input[k];
							int multiply = input[i] * input[j] * input[k];
							if (multiply > 0) {
								plus += addition/multiply;
								sum += addition/multiply;
							}
						}
					}
				}
			}
			System.out.println(plus);
			System.out.println(sum);
		}
	}
}
