package SalesforceOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

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
			
	       driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("sales");
			
			driver.findElement(By.xpath("//p[@title='Manage your sales process with accounts, leads, opportunities, and more']")).click();
			
			
			
			
			
			  WebElement element = driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
		      JavascriptExecutor executor = (JavascriptExecutor)driver;
		      executor.executeScript("arguments[0].click();", element);
		      
		
		      driver.findElement(By.xpath("//input[@name='Lead-search-input']")).sendKeys("Kumar",Keys.RETURN);
		      
		  
		      
		      try {
		    	    WebElement button = driver.findElement(By.xpath("//a[contains(text(),'Kumar')]/ancestor::th/following-sibling::td[8]//a[@role='button']"));
		    	    button.click();
		    	}
		    	catch(org.openqa.selenium.StaleElementReferenceException ex)
		    	{
		    	    WebElement button = driver.findElement(By.xpath("//a[contains(text(),'Kumar')]/ancestor::th/following-sibling::td[8]//a[@role='button']"));
		    	    button.click();
		    	}
		      
		
		      driver.findElement(By.xpath("//div[text()='Edit']/parent::a")).click();
		
		      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ganesh");
		      
		      

			  WebElement elementOne = driver.findElement(By.xpath("//button[contains(@id,'combobox-button') and contains(@aria-label,'Lead Status')]"));
		      JavascriptExecutor executorOne = (JavascriptExecutor)driver;
		      executorOne.executeScript("arguments[0].click();", elementOne);
		      
		      
		      driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Working - Contacted']")).click();
		      
		      
		      driver.findElement(By.xpath("//button[text()='Save']")).click();
		      
		      
		      
		      
//		      try {
//		    	    WebElement buttonOne = driver.findElement(By.xpath("//a[contains(text(),'Kumar')]"));
//		    	    buttonOne.click();
//		    	}
//		    	catch(org.openqa.selenium.StaleElementReferenceException exe)
//		    	{
//		    	    WebElement buttonOne = driver.findElement(By.xpath("//a[contains(text(),'Kumar')]"));
//		    	    buttonOne.click();
//		    	}
		      
		      
		  	driver.navigate().back();
		  	
		  	driver.navigate().forward();
		      
		      
		   //   driver.findElement(By.xpath("//a[contains(text(),'Kumar')]")).click();
		      
		      
		     
		      
		      
//		      String text = driver.findElement(By.xpath("//span[text()='success']/parent::lightning-icon/following-sibling::div//span")).getText();
//		      
//		      System.out.println(text);
		      
//		      
//     String str1 = driver.findElement(By.xpath("//a[contains(text(),'Kumar')]")).getText();
//     String str2 = driver.findElement(By.xpath("//a[contains(text(),'Kumar')]/ancestor::th/following-sibling::td[6]/span")).getText();
//////		      
////		      
      System.out.println(str1);
////		      
	  System.out.println(str2);
//		      
//		      
//	      if (text.isBlank())
//	    	  
//		      {
//		    	  System.out.println("string is null");
//		    	  
//		      }		
//	      
//		      else {
//		    	  
//		    	  System.out.println(" not null");
//		      }
//		      
//	      if(text.contains("Ganesh") && text.contains("saved"))
//		      {
//		    	  
//		    	  System.out.println("edit successful");
//		      }
//	      
	      
		    //  driver.findElement(By.xpath("//button[contains(@id,'combobox-button') and contains(@aria-label,'Lead Status')]")).click();
		      
		      
		      
//		      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Working - Contacted']/parent::a")));
//		      
//		      // click on the compose button as soon as the "compose" button is visible
//		      driver.findElement(By.xpath("//span[text()='Working - Contacted']/parent::a")).click();
		      
		//      driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Working - Contacted']")).click();
		      
		      
		    //  driver.findElement(By.xpath("(//span[text()='Working - Contacted'])[2]")).click();
		      
		     // aria-label="Lead Status
		      
		      
		    
		

	}

}
