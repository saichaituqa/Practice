package Collections;

public class duplicatesArray {

	public static void main(String[] args) {
		
		String str="naveen";
		
		//nave@@
		
		char ch[]=str.toCharArray();
		
		
		for (int i = 0; i <= ch.length-1; i++) {
			int count=1;
			for(int j=i+1;j<=ch.length-1;j++) {
				if(ch[i]==ch[j] && ch[j]!='@')
				{
					count++;
					ch[j]='@';
				}
			}
			if(ch[i]!='@') {
				System.out.print(ch[i]+""+count);
			}
		}
	}
			
		
	//a2b3c4
	
	//aabbbcccc
}
