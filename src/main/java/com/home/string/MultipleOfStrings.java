package com.home.string;


public class MultipleOfStrings {
	public static void main(String[] args) {
		String s1="0";
		String s2 ="12";
		String result = multi(s1, s2);
		System.out.println(result);
	}
	
	public static String multiply(String s1 , String s2){
		String n1 = new StringBuilder(s1).reverse().toString();
		String n2 = new StringBuilder(s2).reverse().toString();
		
		int[] d = new int[s1.length() + s2.length()];
		for(int i=0; i<n1.length(); i++){
			for(int j=0; j<n2.length(); j++){
				d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
			}
		}
		
		StringBuilder sb = new StringBuilder();
		 
	    //calculate each digit
	    for(int i=0; i<d.length; i++){
	        int mod = d[i]%10;
	        int carry = d[i]/10;
	        if(i+1<d.length){
	            d[i+1] += carry;
	        }
	        sb.insert(0, mod);
	    }
	 
	    //remove front 0's
	    while(sb.charAt(0) == '0' && sb.length()> 1){
	        sb.deleteCharAt(0);
	    }
	 
	    return sb.toString();
	}
	
	
	////  simple multiple method for String multiplication   ///
	
	public static String multi(String s1, String s2){
		int a = Integer.valueOf(s1);
		int b = Integer.valueOf(s2);
		String c = String.valueOf(a*b);
		return c;
	}

}
