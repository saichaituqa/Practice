 package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceHashMap {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,7,8,9,7,8,12,1,14};
		
		HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
		
		if(hs.containsKey(a[i]))
		{
			hs.put(a[i],hs.get(a[i])+1);
		}
		else
		{
			hs.put(a[i], 1);
		}
	}
		for (Entry<Integer, Integer> s:hs.entrySet()) {
			
			System.out.println(s);
		}
}
}
