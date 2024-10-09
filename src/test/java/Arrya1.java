import java.util.TreeSet;

public class Arrya1 extends anagram {

	public static void main(String[] args) {
		
		String[] str= {"march","April","May"};
		
		TreeSet ts=new TreeSet();
		
		for (int i = 0; i < str.length; i++) {
			
			ts.add(str[i]);	
		}
		
		System.out.println(ts);
	}
}
