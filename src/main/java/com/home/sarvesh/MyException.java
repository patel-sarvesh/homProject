package com.home.sarvesh;

public class MyException{
	
	public static void main(String[] args) {
		try{
			sum(-10,-20);
		}
		catch(TestException ex){
			System.out.println(ex);
		}
	}
	
	public static void sum(int a , int b) throws TestException{
		if(a<0 || b<0)
			throw new TestException((a<0)? a:b<0? b:0);
		else
			System.out.println(a+b);
	}

}
class TestException extends Exception{
	private int val;
	public TestException(int a){
		val = a;
	}
	public String toString(){
		return "TestException " + val + " is less than zero";
	}
}

