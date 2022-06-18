package SalesforceOne;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDashboard {

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
			
			driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Dashboard");
			
			
			WebElement element = driver.findElement(By.xpath("//mark[text()='Dashboard']/../../../../.."));
		     
			JavascriptExecutor executor = (JavascriptExecutor)driver;
		    
			executor.executeScript("arguments[0].click();", element);
			
			
			driver.findElement(By.xpath("//div[text()='New Dashboard']/..")).click();
			
			
           WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
			
			
			driver.switchTo().frame(frame1);
			
			
			driver.findElement(By.id("dashboardNameInput")).sendKeys("Yellow Automation");
			
			driver.findElement(By.id("submitBtn")).click();
			
			
			
			
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			
//			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Save']")));
//			
//			ele.click();
			
			
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
			
		 driver.switchTo().defaultContent();
			
			
          boolean displayed = driver.findElement(By.xpath("//span[text()='Dashboard saved']")).isDisplayed();
			
			if(displayed)
				
			{				
			System.out.println("successfully saved");
			}

			
			
			
			
			
//			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			
//			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dashboardNameInput")));
//			
//			System.out.println(ele);
//			
			
			
					
				//.sendKeys("Salesforce Automation by Venkat");
				
			
			
			
		//	
			
//			
//			
//			
//			
//			
//			
//			
//
//	  
//			
//			
//			
		
	}

}
