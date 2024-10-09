import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ae=new ArrayList<Integer>();
		
		ae.add(12);
		ae.add(13);
		ae.add(11);
		
		System.out.println(ae);
		
		Collections.sort(ae);
		
		System.out.println(ae);
		
		Collections.reverse(ae);
		
		System.out.println(ae);
	}
}
