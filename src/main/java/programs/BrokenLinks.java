package programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--disable-notifications");		
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));//img
		
		for (WebElement ele : links) {
			
			String broken = ele.getAttribute("href");//src
			
			try {
				
			URL u=new URL(broken);
			
			HttpURLConnection http=(HttpURLConnection)u.openConnection();
			
			Thread.sleep(10);
			
			http.connect();
			
			int rescode = http.getResponseCode();
			
			if(rescode>400)
			{
				System.out.println(broken+"it is a broken link");
			}
			else
			{
				System.out.println(broken+"it is not a broken link");
			}
			}
			catch(Exception e)
			{
				
			}
		}
			
	}
}
