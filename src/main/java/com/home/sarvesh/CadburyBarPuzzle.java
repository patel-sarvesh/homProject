package com.home.sarvesh;

public class CadburyBarPuzzle {
	public static void main(String[] args) {
		int M = 5, N=6 , P=3 , Q=4;
		int numOfEmployee = cadbury(M, N, P, Q);
		System.out.println(numOfEmployee);
	}
	
	public static int cadbury(int input1, int input2, int input3, int input4) {
		int total = 0;
		if (input2 >= input1 && input4 >= input3 && input1 > 0 && input2 > 0 && input3 > 0 && input4 > 0) {
			for (int row = input1; row <= input2; row++) {
				for (int column = input3; column <= input4; column++) {
					int rRow = row, rColumn = column;
					System.out.println(row + "x" + column);
					while (true) {
						if (rRow == 0 && rColumn == 0) {
							break;
						}
						if (rRow > rColumn) {
							rRow = rRow - rColumn;
							total = total + 1;
						}
						if (rRow < rColumn) {
							rColumn = rColumn - rRow;
							total = total + 1;
						}
						if (rRow == rColumn) {
							rRow = 0;
							rColumn = 0;
							total = total + 1;
						}
					}
				}
			}
		}
		return total;
}

}
