package Functions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redirection
{
	
	public WebDriver driver;
/*	WebDriverWait wait15;
	WebDriverWait wait10;
	WebDriverWait wait5;
	*/
	
	
	WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));

	
	
	public void ChromInitialise()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkumarj\\OneDrive - Capgemini\\Desktop\\Automation Projects\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
		
	}
	
	public void OpenBrowser()
	{
		driver.get("https://wwwqt.royalmail.com/redirections/new/quote");
		driver.manage().window().maximize();
		try
		{
			Thread.sleep(10000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@id='consent_prompt_submit']")).click();
	}
	
	public void TypeOfApplication()
	{
		WebElement IconIndividual = driver.findElement(By.xpath("//button[@aria-label='Individual application']"));
		IconIndividual.click();
		
	}
	public void WhenAreYouMoving()
	{
		LocalDate today = LocalDate.now();                                 
        LocalDate sixMonthsFuture10 =today.minusMonths(6);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        String SixmonthsAgo = sixMonthsFuture10.format(formatter);
		
      WebElement DateOfMoving = driver.findElement(By.xpath("//input[@id='movingDate']"));
      try
		{
			Thread.sleep(2000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
      DateOfMoving.sendKeys(SixmonthsAgo);
  
	}
	public void WhenAreYouMovingContinue()
	{
		WebElement DateContinue = driver.findElement(By.xpath("//*[@id=\"rmg\"]/main/div[1]/div/div[2]/section/form/div[2]/button"));
		DateContinue.click();
		
	}
	public void WhereAreYouMovingTo()
	{
		WebElement MoveTo = driver.findElement(By.xpath("//button[@aria-label='UK address']"));
		MoveTo.click();
	}
	
	public void StartDateToRedirectYourMail()
	{		
		String SixmonthsFuture = SixMonthsFuture10Date();
		
		WebElement StartDate = driver.findElement(By.xpath("//*[@id=\"startDate\"]"));
		StartDate.sendKeys("SixmonthsFuture");
	}
	
	public void ThreeSelectDurationAndPrice()
	{
		try
		{
			Thread.sleep(15000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		WebElement Price = driver.findElement(By.xpath("//*[@id=\"rmg\"]/main/div[2]/div[3]/div/div[3]/div[6]/button"));
		Price.click();
		
	}
	
	public void TotalPriceToPay()
	{
		try
		{
			Thread.sleep(10000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		WebElement ConfirmRedirection = driver.findElement(By.cssSelector("#rmg > main > div:nth-child(1) > div._container_1rrrk_1 > div > div:nth-child(2) > div > div._summary_1rrrk_264 > button"));
		ConfirmRedirection.click();
		System.out.println("TotalPriceToPay");
	}
	
	public void DomesticAbuse()
	{
		WebElement AbuseSkip = driver.findElement(By.cssSelector("#submit"));
		AbuseSkip.click();
		
	}
	
	public void DetailsOfWhoMoving()
	{		
		WebElement YourDetails = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		YourDetails.sendKeys("bigtest@gmail.com");
		
		
		WebElement dropdownElement = driver.findElement(By.id("title"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Mr"); 
	
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Paul");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Walker");
		
		driver.findElement(By.xpath("//input[@id='date-input-3-day']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@id='date-input-3-month']")).sendKeys("01");
		driver.findElement(By.xpath("//input[@id='date-input-3-year']")).sendKeys("1992");
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("+44999009090");
		
		driver.findElement(By.xpath("//*[@id=\"rmg\"]/main/div[1]/div/form/section[2]/div/div/div[1]/label")).click();
		
	}
	
	public void DetailsOfWhoMovingContinue()
	{
		WebElement DetailsOfWhoMovingContinue = driver.findElement(By.xpath("//*[@id=\"rmg\"]/main/div[1]/div/form/section[2]/button"));
		DetailsOfWhoMovingContinue.click();
	}
	
	public void YourMoveDetailsFrom()
	{
		try
		{
			Thread.sleep(5000);
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
       
	public void YourMoveDetailsTo()
	{

		WebElement inputFieldTo = driver.findElement(By.xpath("//input[@id=\"redirectToAddress\"]"));
		inputFieldTo.sendKeys("EC1C1CC");
		try
		{
			Thread.sleep(5000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"redirectToAddress-address-list\"]"));
        WebElement desiredOptionTo = driver.findElement(By.xpath("//ul[@id='redirectToAddress-address-list']//li[.//span[contains(text(), '1F1, 1C, Maxwell Street')] and .//span[contains(text(), 'Edinburgh, EH10 5HT')]]"));
        desiredOptionTo.click();
	}
 
	public void IsTheNewAddressYourOwn()
	{
		WebElement IsTheNewAddressOwn = driver.findElement(By.xpath("//label[@for=\"new-address-type-own\"]"));
		IsTheNewAddressOwn.click();
	}
	
	public void IsTheNewAddressRented()
	{
		WebElement IsTheNewAddressRented = driver.findElement(By.xpath("//label[@for=\"new-address-type-rented\"]"));
				//wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for=\\\"new-address-type-rented\\\"]")));
		IsTheNewAddressRented.click();		
	}
	
	public void WillYouBeReturningToYourOriginalAddressYes()
	{
		WebElement WillYouBeReturningToYourOriginalAddressYes = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\\\"returning-to-address-yes\\\"]")));
		WillYouBeReturningToYourOriginalAddressYes.click();
	}
	
	public void WillYouBeReturningToYourOriginalAddressNo()
	{
		driver.findElement(By.xpath("//input[@id=\"returning-to-address-no\"]")).click();
	}
	
	public void YourMoveDetailsContinue()
	{
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	
	public void RedirectionOptionsContinue()
	{
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	
	public void SummaryBillingAddressOld()
	{
		driver.findElement(By.xpath("//input[@id=\"old-address\"]")).click();
	}
	

	public void SummaryBillingAddressNew()
	{
		driver.findElement(By.xpath("//input[@id=\"new-address\"]")).click();
	}
	
	public void SummaryContinueToPayment()
	{
		driver.findElement(By.xpath("//input[@id=\\\"new-address\\\"]")).click();
	}
	
	
	public void PayWithDebitOrCreditCard()
	{
		try
		{
			Thread.sleep(10000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		WebElement CardNumber = driver.findElement(By.xpath("//input[@id=\"cardNumber\"]"));
		CardNumber.sendKeys("4111111111111111");
		
		WebElement CardHoldersName = driver.findElement(By.xpath("//input[@name=\"cardholderName\"]"));
		CardHoldersName.sendKeys("Paul");
		
		WebElement ExpiryDateMonth = driver.findElement(By.xpath("//input[@name=\"expiryDate.expiryMonth\"]"));
		ExpiryDateMonth.sendKeys("12");
		
		WebElement ExpiryDateYear = driver.findElement(By.xpath("//input[@name=\"expiryDate.expiryYear\"]"));
		ExpiryDateYear.sendKeys("25");
		
		WebElement SecurityCode = driver.findElement(By.xpath("//input[@name=\"securityCode\"]"));
		SecurityCode.sendKeys("213");
		
		WebElement MakePayment = driver.findElement(By.xpath("//input[@class=\"button btn-make-payment\"]"));
		MakePayment.click();
		
	}
	
	public void LastStepPaymentDeclined()
	{
		try
		{
			Thread.sleep(10000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		WebElement ReturnToRedirection = driver.findElement(By.xpath("//button[@class=\"returnButton buttonOutlined buttonLoading buttonText\"]"));
		ReturnToRedirection.click();
	}
	
	
	
	
	@Test
	public static String SixMonthsFuture10Date()
	{
		LocalDate today = LocalDate.now();                                 
        LocalDate sixMonthsFuture10 =today.plusDays(10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("sixMonthsFuture10" + sixMonthsFuture10); 
        System.out.println("sixMonthsFuture10.format(formatter" + sixMonthsFuture10.format(formatter)); 
        return sixMonthsFuture10.format(formatter);
	}
	/*
	public static String SixMonthsBeforeDate()
	{
		LocalDate today = LocalDate.now();                          
        LocalDate sixMonthsAgo = today.minusMonths(6);       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     //   System.out.println(sixMonthsAgo.format(formatter));
        return sixMonthsAgo.format(formatter);
	}
	*/
	public void CloseBrowser()
	{
		
		try
		{
			Thread.sleep(10000);
		}			
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
}