package com.home.sarvesh;

import java.util.Scanner;

public class Accolite {
	public static void main(String args[] ) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] monk = new int[N];		
    	int[] notMonk = new int[M];
    	for(int i=0; i<N ; i++){
    		monk[i] = sc.nextInt();
    	}
    	for(int i=0; i<M ; i++){
    		notMonk[i] = sc.nextInt();
    	}
    	sc.close();
    	
    	//  method to find out winner between two arrays.
    	// after comparing first element with all elements of other array with condition
    	// if it gets smaller value it increase the x and if greater then y same process for other array too.
    	// after adding all product value(monkMultiple) the winner will be the one having max value of monkMultiple.
    	
		int x =0, y=0, monkMultiple = 0, a=0, b=0, notMonkMultiple = 0;
		for(int i=0; i< N ; i++){
			for(int j=0; j<M ; j++){
				if(monk[i] > notMonk[j])
					x++;
				else if(monk[i] < notMonk[j])
					y++;
				if(j==M-1){
					monkMultiple += x*y;
					x=0;y=0;
				}
			}
		}
		for(int j=0; j< M ; j++){
			for(int i=0; i<N ; i++){
				if(monk[i] < notMonk[j])
					a++;
				else if(monk[i] > notMonk[j])
					b++;
				if(i==N-1){
					notMonkMultiple += a*b;
					a=0; b=0;
				}
			}
		}
		int score = monkMultiple - notMonkMultiple;
		if(score <0)
			System.out.println("!Monk " + Math.abs(score));
		else if(score >0)
			System.out.println("Monk "+score);
		else
			System.out.println("Tie");
    }
}
