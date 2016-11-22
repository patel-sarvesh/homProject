package com.home.sarvesh;

import java.util.Arrays;

public class BridgeConstruction {
	public static void main(String[] args) {
		int input1 = 5;
		int[] input2 = { 4, 3, 2, 6 ,1};
		int[] cost = findCostOfJoining(input1, input2);
		System.out.println(Arrays.toString(cost));
	}

	// find the minimum cost of joining two pipes and return length of all pipes
	// joined that is in sorted in ascending order.

	public static int[] findCostOfJoining(int input1, int[] input2) {
		int[] cost = new int[input1 - 1];
		if (input1 < 2) {
			return cost;
		} else {
			Arrays.sort(input2);
			int sum = 0;
			int j = 0;
			for (int i = 0; i < input1; i++) {
				if (i > 1) {
					sum += input2[i];
					cost[j++] = sum;
				} else {
					sum += input2[i] + input2[i+1];
					cost[j++] = sum;
					i++;
				}
			}
		}

		return cost;
	}
}
