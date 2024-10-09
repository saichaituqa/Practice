package dummy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.Test;

import groovyjarjarpicocli.CommandLine.RunAll;

public class Collections {

	@Test
	
	public void arraylist() {
		
		ArrayList al=new ArrayList();
		
		al.add(24);
		al.add(36);
		al.add(25);
		al.add(24);
		al.add(29);
		System.out.println(al);
		
//		for ( Object num : al) {
//			
//			System.out.println(num);
//		}
		
	}
	
	//@Test
	
//	public void linkedList() {
//		
//		LinkedList li=new LinkedList();
//		
//		li.add(24);
//		li.add(36);
//		li.add(25);
//		li.add(24);
//		
//		System.out.println(li);
//	}
}
