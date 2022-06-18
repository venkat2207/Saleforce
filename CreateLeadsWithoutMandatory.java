package SalesforceOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadsWithoutMandatory {

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
		
		
		//driver.findElement(By.xpath("//span[text()='Leads']/parent::a")).click();
		
		
		  WebElement element = driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", element);
	      
	      
	      driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
	      
	      driver.findElement(By.xpath("//button[@name='salutation']")).click();
	      
	      driver.findElement(By.xpath("//span[text()='Mr.']")).click();
	      
	      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ganesh");
	      
	      
	      //driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
	      
	      driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");
	      
	      
	      driver.findElement(By.xpath("//button[text()='Save']")).click();
	      
       boolean displayed = driver.findElement(By.xpath("//h2[text()='We hit a snag.']")).isDisplayed();
       
       if(displayed)
       {
    	  String text = driver.findElement(By.xpath("//input[@name='lastName']/parent::div/following-sibling::div")).getText();
    	  
    	  if (text.equalsIgnoreCase("Complete this field."))
    	  {
    		  
    		  System.out.println("test successful");
    	  }
    	   
       }
		

	}

}
