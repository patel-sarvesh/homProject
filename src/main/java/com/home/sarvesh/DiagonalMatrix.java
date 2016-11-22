package com.home.sarvesh;

import java.util.Scanner;

public class DiagonalMatrix {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int col = sc.nextInt();
	    int[][] matrix = new int[row][col];
	    for(int i=0 ; i<row ; i++){
	        for(int j=0 ; j<col ; j++){
	            matrix[i][j] = sc.nextInt();
	        }
	    }
	    sc.close();
//	    int sum = addMatrixElements(matrix , row , col);
	    int sum = addDiagonals(matrix, row, col);
	    System.out.println(sum);
	   }
	   
////  to add all elements of matrix   ////	

	   public static int addMatrixElements(int[][] matrix, int row , int col){
	       int sum=0;
	       for(int i=0 ; i<row ; i++){
	           for(int j=0 ; j<col ; j++){
	               sum += matrix[i][j];
	           }
	       }
	       
	       return sum;
	   }
	   
	   
	   ///// to add elements of diagonals of matrix  ///
	   
	   public static int addDiagonals(int[][] matrix, int row , int col){
		   int sum = 0;
		   for(int i=0, j=0; i<row && j< col; i++, j++){
			   sum += matrix[i][j];
		   }
		   for(int i=0, j=col-1; i<row && j>=0 ; i++, j--){
			   sum += matrix[i][j];
		   }
		   
		   return sum;
	   }
}
