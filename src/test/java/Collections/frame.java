package Collections;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone");
		
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		int count = elements.size();
		
		for (int i = 0; i < count; i++) {
			
			String value = elements.get(i).getText();
			System.out.println(value);
		}
	}
}
