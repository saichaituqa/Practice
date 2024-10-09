package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Program1 {

	public static void main(String[] args) {
		
		String str="a2b3cc4";
		
		String result="";
		
		char[] ch=str.toCharArray();
		
//		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
//		
//		for (int i = 0; i < ch.length; i++) {
//			
//			if(hs.containsKey(ch[i]))
//			{
//				hs.put(ch[i], hs.get(ch[i])+1);
//			}
//			else
//			{
//				hs.put(ch[i], 1);
//			}	
//		
//		}
//		System.out.println(hs);
//for (Entry<Character, Integer> s:hs.entrySet()) {
//			
//			System.out.print(s);
//		}
		
		for (int i = 0; i < ch.length; i+=2) {
			
			char ch1=ch[i];
			
			int count=ch[i+1]-'0';
			
			for (int j = 0; j < count; j++) {
				
				result+=ch;
			}
		}
		System.out.println(result);
	
		}

		}
	

