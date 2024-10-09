package projectTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.beust.jcommander.defaultprovider.PropertyFileDefaultProvider;

public class Writingdatatoproperty {

	@Test
	public void writeDatatopropertyfile() throws IOException {
			
		File f=new File("./src/test/resources/file.properties");
		
		//FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.properties");
		
		Properties p=new Properties();
		
		p.setProperty("url", "www.google.com");
		p.setProperty("Username", "saichaitu");
		p.setProperty("Password", "123456");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/file.properties");
		
		p.store(fos, "data");
		
		
		
	}
	
	@Test
	public void readDatafromPropertyFile() throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/file1.properties");
		
		Properties p=new Properties();
		p.load(fis);
		String UNAME=p.getProperty("Username");
		String url = p.getProperty("url");
		String Password=p.getProperty("Password");
		
		System.out.println(url);
		System.out.println(UNAME);
		System.out.println(Password);
		
	}
	
	@Test
	public void readExceldata() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		//String sh = wb.getSheet("Details").getRow(0).getCell(0).getStringCellValue();
		
		Sheet sh = wb.getSheet("demo1");
		
		Cell cell = sh.getRow(0).getCell(0);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		}
	}
