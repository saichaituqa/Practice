package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class scannerString {

	public static void main(String[] args) {
		
		String str="i am form india";
		
		String st1 = str.replace(" ","");
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		char[] s = st1.toCharArray();
		
		for (int i = 0; i < s.length; i++) {
			
			if(hs.containsKey(s[i]))
			{
				hs.put(s[i], hs.get(s[i])+1);
			}
			else
			{
				hs.put(s[i], 1);
			}
		}
		System.out.println(hs);
		
		for( Entry<Character, Integer> sr : hs.entrySet())
				
		System.out.println(sr.getKey()+""+sr.getValue());
	}
}
