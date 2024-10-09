package projectTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import programs.DataProviderTest;

public class Data {

	@Test(dataProviderClass = DataProviderTest.class,dataProvider ="multipledata")
	public void details(String firstName,String lastName,String number,String password)
	{
		String s="hello";
		
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstname.sendKeys(firstName);
		
		ArrayList al=new ArrayList();
		
		al.add(firstname);	
		

	}
	}
