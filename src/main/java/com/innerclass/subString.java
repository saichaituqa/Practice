package com.innerclass;

public class subString {

	public static void main(String[] args) {

		String str="sarendra";

		//char ch[]=s.toCharArray();

		for (int i = 0; i <=str.length()-1; i++) {
			
			for(int j=1 ; j<=str.length()-1;i++) {
				
				System.out.println(str.substring(j, i));
		}
	}
}
}
