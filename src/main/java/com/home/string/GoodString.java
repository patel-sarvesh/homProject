package com.home.string;

public class GoodString {
//	static int count= 0;
	public static void main(String[] args) {
//		String s = "bacdefgahiplaop";
		String s = "baca";
		int numOfOperations = countOperation(s);
		System.out.println(numOfOperations);
	}

	//  method to find the number of operation to make a string as good string
	// conditions for good string - length of string >=2 & its first and last alphabet should be same.
	
		public static int countOperation(String s) {
			char[] ch = s.toCharArray();
			int l = ch.length;
			int count = 0;
			for (int i = 0; i < l; i++) {
				for (int j = l-1; j > i; j--) {
					if (ch[i] == ch[j] && i == 0 && j == l-1)
						return count;
					else if (ch[i] == ch[j]) {
						int cal = i + (l-j-1);
						if(cal==1){
							count = cal;
							return count;
						}
						else if(cal<count || count==0){
							count = cal;
							cal = 0;
						}
					}
					else if(i==j-1 && count > 0)
						return count;
				}
			}
			if(count == 0){
				return -1;
			}
			return count;
	}

	
//	public static int countOperation(String s, int count) {
//		
//		if (s.substring(0, 1) == s.substring(s.length()-1, s.length()))
//		{
//			return count;
//		}
//		if(s.length()<2)
//		{
//			return -1;
//		}
//		if (s.substring(0, 1) != s.substring(s.length() -1, s.length()))
//		{
//			count++;
//			return Math.min(countOperation(leftOperator(s)), countOperation(rightOperator(s)));
//		}
//		else
//      return count;
//	}
//
//public static String leftOperator(String str)
//{
//return str.substring(1, str.length());
//}
//
//public static String rightOperator(String str)
//{
//return str.substring(0, str.length() -1);
//}
}
