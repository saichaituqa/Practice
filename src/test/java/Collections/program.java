package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class program {

	    public static void main(String[] args) {
	       
	    	String str="google";
	       
	       char ch[]=str.toCharArray();
	       
	       HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	       
	       for(int i=0;i<ch.length;i++)
	       {
	           if(hs.containsKey(ch[i]))
	           {
	               hs.put(ch[i],hs.get(ch[i])+1);
	           }
	           else
	           {
	               hs.put(ch[i],1);
	           }
	       }
	       for (Entry<Character, Integer> c : hs.entrySet()) {
	    	  
	    	  
	    	   if(c.getValue()==1)
	    	   {
	    		   System.out.println(c.getKey()+"----->"+c.getValue());
	    	   }
	    	   
	    	   
		}
	    }
	}

