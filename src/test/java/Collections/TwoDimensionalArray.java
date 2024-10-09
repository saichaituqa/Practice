package Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/SaiChaitanya/Desktop/css.html");
		
		List<WebElement> ele = driver.findElements(By.cssSelector("li[class=thing]"));
		
		for (WebElement text: ele) {
			
			String select = text.getText();
			
			System.out.println(select);
		}
	}
}
