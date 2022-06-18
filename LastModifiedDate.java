package SalesforceOne;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LastModifiedDate {

	public static void main(String[] args) throws ParseException {
		

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
			
			
			driver.findElement(By.xpath("//span[text()='Last Modified Date']/..")).click();
			
			//driver.findElement(By.xpath("//span[text()='Last Modified Date']/..")).click();
			
			
			String text1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/span/span")).getText();
			
			String text2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/span/span")).getText();
			
			System.out.println(text1);
			
			System.out.println(text2);
			
			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy, hh:mm a");  
			
			Date date1=formatter1.parse(text1);  
			
			Date date2=formatter1.parse(text2); 
			
			if(date1.compareTo(date2) >=0) {
		         System.out.println("Its in descending order");
		      
			}
			else
			{
		         System.out.println("Its in ascending order");
		         
			}
		    
			
//			driver.findElement(By.xpath("//span[text()='Last Modified Date']/..")).click();
//			
//           String text3 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/span/span")).getText();
//			
//			String text4 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/span/span")).getText();
//			
//			System.out.println(text3);
//			
//			System.out.println(text4);
//			
//			SimpleDateFormat formatter2=new SimpleDateFormat("dd/MM/yyyy, hh:mm a");  
//			
//			Date date3=formatter2.parse(text3);  
//			
//			Date date4=formatter2.parse(text4); 
//			
//			if(date3.compareTo(date4) >=0) {
//		         System.out.println("Its in descending order");
//		      
//			}
//			else
//			{
//		         System.out.println("Its in ascending order");
//		         
//			}
//		    
//			
			
			
			
		

	}

}
