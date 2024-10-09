import java.awt.Window;
import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationScript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("android");
		
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']"));
		
		TreeSet ts=new TreeSet();
		
		for (WebElement text : list) {
			
			String t=text.getText();
			
			ts.add(t);
		}
		
		System.out.println(ts);
		
		
		////li[@class='sbct PZPZlf']
	}
}
