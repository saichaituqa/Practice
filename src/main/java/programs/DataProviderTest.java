package programs;

import org.testng.annotations.Test;

public class DataProviderTest {

	@org.testng.annotations.DataProvider(name="multipledata")
	
	public String[][] facebookFeild() {
		
		String a[][]=new String[3][4];
		
		a[0][0]="chandra";
		a[0][1]="ndra";
		a[0][2]="9887456321";
		a[0][3]="hello";
		
		a[1][0]="indra";
		a[1][1]="ndra";
		a[1][2]="9898456321";
		a[1][3]="kjsf";
		
		a[2][0]="ravi";
		a[2][1]="chai";
		a[2][2]="9877456321";
		a[2][3]="hai";
	
		return a;
	}
	
	
}
