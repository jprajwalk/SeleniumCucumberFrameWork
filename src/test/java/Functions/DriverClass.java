package Functions;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverClass
{	
	public WebDriver driver ;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	@Test
	public void TestRun()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkumarj\\OneDrive - Capgemini\\Desktop\\Automation Projects\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://wwwqt.royalmail.com/redirections/new/step2");
		try
		{
			Thread.sleep(10000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"consent_prompt_submit\"]")).click();
		try
		{
			Thread.sleep(10000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		WebElement inputFieldFrom = driver.findElement(By.xpath("//input[@id=\"redirectFromAddress\"]"));
		inputFieldFrom.sendKeys("EC1A1CC");
		try
		{
			Thread.sleep(5000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"redirectFromAddress-address-list\"]")) ;
        WebElement desiredOptionFrom = driver.findElement(By.xpath("//*[@id=\"redirectFromAddress-address-list\"]/li[.//span[contains(text(),'1C, Oakbank Drive')] and .//span[contains(text(),'Accrington, BB5 0DJ')]]"));
        desiredOptionFrom.click();
		
		
	}
	
	
	
	
	
}
