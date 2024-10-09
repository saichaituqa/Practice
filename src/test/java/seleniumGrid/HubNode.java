package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HubNode {

	@Test
	public void grid() throws MalformedURLException {
		
		System.out.println("Test 1");
		
		DesiredCapabilities ds=new DesiredCapabilities();
		
		ds.setBrowserName("chrome");
		
		ds.setPlatform(Platform.WIN10);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.106:4444"), ds);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	@Test
	public void grid1() throws MalformedURLException {
		
		System.out.println("Test 2");
		
		DesiredCapabilities ds=new DesiredCapabilities();
		
		ds.setBrowserName("chrome");
		
		ds.setPlatform(Platform.WIN10);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.106:4444"), ds);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	@Test
	public void grid2() throws MalformedURLException {
		
		System.out.println("Test 3");
		DesiredCapabilities ds=new DesiredCapabilities();
		
		ds.setBrowserName("chrome");
		
		ds.setPlatform(Platform.WIN10);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.106:4444"), ds);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
