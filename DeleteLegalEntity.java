package SalesforceOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLegalEntity {

	public static void main(String[] args) {
		
		

	       WebDriverManager.chromedriver().setup();
	        
	        
	    	
			ChromeOptions options=new ChromeOptions();
			
			options.addArguments("--disable-notifications");
			
			WebDriver driver=new ChromeDriver(options);
	        
	        
			
		
			driver.manage().window().maximize();
			
			driver.get("https://login.salesforce.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
			
			driver.findElement(By.id("password")).sendKeys("BootcampSel@123");
			
			driver.findElement(By.id("Login")).click();
			

			driver.findElement(By.className("slds-icon-waffle")).click();
			
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("legal Entities");
			
			//driver.findElement(By.xpath("//a[@data-label='Legal Entities']")).click();
			
			WebElement element = driver.findElement(By.xpath("//a[@data-label='Legal Entities']"));
		     
			JavascriptExecutor executor = (JavascriptExecutor)driver;
		    
			executor.executeScript("arguments[0].click();", element);
			
			
			WebElement elementOne = driver.findElement(By.xpath("//span[text()='Legal Entities']/.."));
			
            JavascriptExecutor executorOne = (JavascriptExecutor)driver;
		    
			executorOne.executeScript("arguments[0].click();", elementOne);
			
			
		//	driver.findElement(By.xpath("//span[text()='Legal Entities']/..")).click();
			
			
			driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Salesforce Automation by Venkat",Keys.RETURN);
			
			
			
			//driver.findElement(By.xpath("//span[text()='Show Actions']/../..")).click();
			
			
//			 
		       try {
		    	    WebElement button = driver.findElement(By.xpath("//span[text()='Show Actions']/../.."));
		    	            button.click();
		    	}
		    	catch(org.openqa.selenium.StaleElementReferenceException ex)
		    	{
		    	    WebElement button = driver.findElement(By.xpath("//span[text()='Show Actions']/../.."));
		    	            button.click();
		    	}
		       
//			
		driver.findElement(By.xpath("//div[text()='Delete']/..")).click();
		
		driver.findElement(By.xpath("//span[text()='Delete']/..")).click();
		
		String text = driver.findElement(By.xpath("//span[contains(text(),'Legal Entity')]")).getText();
		
		System.out.println(text);
		
		

	}

}
