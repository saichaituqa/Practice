import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatingScript {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[.='From']/parent::div[@class='sc-htoDjs kyqvCq']/child::input[@id='src']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//text[.='Bangalore']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Vijayawada");
		
		driver.findElement(By.xpath("//div[@class='sc-gZMcBi hviMLb']/child::text[.='Vijayawada']")).click();
		
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']")).click();
		
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		List<WebElement> Busnames = driver.findElements(By.xpath("//div[@class='fare d-block']//ancestor::div[@class='clearfix row-one']/child::div[@class='column-two p-right-10 w-30 fl']"));
		
		String bus="";
		
		for (WebElement webElement : Busnames) {
			
			String names = webElement.getText();
			
			//System.out.println(names);
			bus=names+bus;
		}
		String fair=" ";
		List<WebElement> BusFair = driver.findElements(By.xpath("//div[@class='fare d-block']"));
		
		for (WebElement webElement : BusFair) {
			
			String prices = webElement.getText();
			
			if(prices.contentEquals("1000")) {
			
				fair=prices+fair;
			}
			
		}
		
		System.out.println(bus);
	}
}
