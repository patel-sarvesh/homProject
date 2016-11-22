package com.home.sarvesh;

public class BST {
	public static void main(String[] args) {
		int[] arr = {2,3,1,4,5,11,24};
		int len = arr.length-1;
		NodeH root =null;
		while(len-->=0){
			int i = 0;
			root = insertData(arr[i], root);
			i++;
		}
	}
	
	public static NodeH insertData(int data , NodeH root){
		if(root==null){
			root.data = data;
			return root;
		}
		else{
			NodeH next = root;
			while(next!=null){
				if(next.data > root.data){
					next = next.rgt;
					next.data = data ;
				}
				else{
					next = next.left;
					next.data = data;
				}
			}
		}
		
		return root;
	}
}

class NodeH{
	int data;
	NodeH left;
	NodeH rgt;
	public NodeH(int data){
		this.data = data;
		NodeH left;
		NodeH rgt;
	}
}
