package SalesforceOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {

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
		
		
		driver.findElement(By.xpath("//a[@title='Tasks']/following-sibling::one-app-nav-bar-item-dropdown")).click();
		
		//driver.findElement(By.xpath(" //span[text()='New Task']")).click();
		
		//lightning-icon[contains(@class,'slds-icon-utility-add slds-icon-text-default')]/following-sibling::span[1]
		
		
		 WebElement element = driver.findElement(By.xpath("//span[text()='New Task']"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", element);
		
		
		//driver.findElement(By.xpath("//lightning-icon[contains(@class,'slds-icon-utility-add slds-icon-text-default')]/following-sibling::span[1]")).click();

	      
	      driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("bootcampselenium");
	      
	      
	      
	      driver.findElement(By.xpath("(//input[contains(@class,'default input')])[3]")).sendKeys("Venkat B");
	      
	      Boolean result = driver.findElement(By.xpath("//div[@title='Venkat B']")).isDisplayed();
	      
	      if (result==true)
	      {
	    	  driver.findElement(By.xpath("//div[@title='Venkat B']")).click();
	    	  
	      }
	      
	      
	      driver.findElement(By.xpath("//a[@class='select']")).click();
	      
	      driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
	      
	      driver.findElement(By.xpath("//button[@title='Save']")).click();
	      
	      
	    //a[@title='bootcamp']/..
	      
	      
	      String text = driver.findElement(By.xpath("//span[text()='Task']/../../..")).getText();
	      
	      System.out.println(text);
	      
	      
	      
	      
	      
	}

}
