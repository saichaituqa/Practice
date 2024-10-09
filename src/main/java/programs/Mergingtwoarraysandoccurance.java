package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class Mergingtwoarraysandoccurance {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int b[]= {20,25,30,40,50,65,70};
		
		int a1=a.length;
		
		int b1=b.length;
		
		int c1=a1+b1;
	
		int c[]= new int [c1];
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		
		HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < c.length; i++) {
			
			if(hs.containsKey(c[i]))
			{
				hs.put(c[i], hs.get(c[i])+1);
			}
			else
			{
				hs.put(c[i], 1);
			}
		}
		for ( Entry<Integer, Integer> ele : hs.entrySet()) {
			
			if(ele.getValue()>1)
			{
				System.out.println(ele.getKey()+"===>"+ele.getValue());
			}
		}
	}
}

