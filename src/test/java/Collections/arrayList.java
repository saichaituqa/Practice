package Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class arrayList {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Jeans");
		al.add("Shirt");
		al.add("T-shirt");
		al.add("Shoes");
		al.add("Watches");
		
		for (String alvalues : al) {
			
			System.out.println("Product Names:"+alvalues);
		}
		
		 
		//To create a new WorkBook with xls extension
		 
		 
		FileInputStream fileOut = new FileInputStream(".\\src\\test\\resources\\Test.xlsx");
//		 
//		Workbook wb=WorkbookFactory.create(fileOut);
//		
//		wb.write(fileOut);
//		 
//		fileOut.close();
//		 
//		//To create a new WorkBook with xlsx extension
//		 
//		Workbook wb1 = new XSSFWorkbook();
//		 
//		FileOutputStream fileOut1 = new FileOutputStream("D:\\Test1.xlsx");
//		 
//		wb.write(fileOut1);
//		 
//		fileOut1.close();
//		 
//		}
//		 
//		}
	}
}
