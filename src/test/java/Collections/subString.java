package Collections;

public class subString {

	public static void main(String[] args) {

		String str="abcdeft";

		String str1="bcd";
		String str2="dft";
		String str3="efta";
		String st="";


		for (int i = 0; i < str.length(); i++) {

			for (int j = i+1; j < str.length(); j++) {


				st =str.substring(i, j);

				boolean flag=true;
				if(st.equalsIgnoreCase(str3))
				{
					System.out.println(st+""+"---->"+flag);
				}


			}



		}

	}
}
