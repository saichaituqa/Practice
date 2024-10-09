package Collections;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Arraylistt {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();

		al.add(22);
		al.add(25);
		al.add(26);
		al.add(22);
		al.add(28);

		System.out.println(al);

//		ArrayList all=new ArrayList();
//
//		for (int i = 0; i < al.size(); i++) {
//
//			if(!all.contains(al.get(i)))
//			{
//				all.add(al.get(i));
//			}
//		}
//		System.out.println(all);

		TreeSet ts=new TreeSet(al);
		
		System.out.println(ts);
		
	}

}


