package com.innerclass;

public class Flipkart {

	public static void main(String[] args) {

		String str="https://facebook.co.in.segment.products";

		String[] dot = str.split("[.]");

		for (int i = 0; i < dot.length-1; i++) {

			char[] st = dot[i].toCharArray();

			char s;
			if(i>=1) {
				
				for(int j=st.length-1;j>=0;j--)
				{
					System.out.print(st[j]);
					s = st[j];
				}
				System.out.print(".");
			}
		}
	}
}
