import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Cliniq {

	@Test
	public void cq() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.clinique.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//a[@class=\"gnav-desktop-top-level-title\"]//ancestor::div[@class=\"gnav-desktop-top-level-row\"]//descendant::div[@class=\"gnav-desktop-nav-item\" and a[contains(text(), 'Skincare')]]"));
		
		Actions ae=new Actions(driver);
		
		ae.moveToElement(ele).perform();
		
		
		
	}
}
