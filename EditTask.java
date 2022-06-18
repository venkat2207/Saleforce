package SalesforceOne;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditTask {

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
			
			
			//driver.findElement(By.xpath("//a[@title='Tasks']/following-sibling::one-app-nav-bar-item-dropdown")).click();
			
			//driver.findElement(By.xpath("//span[text()='Recently Viewed']")).click();
			
			
			 WebElement element = driver.findElement(By.xpath("//a[@title='Tasks']"));
		      JavascriptExecutor executor = (JavascriptExecutor)driver;
		      executor.executeScript("arguments[0].click();", element);
			
			
			driver.findElement(By.xpath("//button[@title='Display as Split View']")).click();
			
			driver.findElement(By.xpath("//li[@title='Table']/a")).click();
			
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy");  
			 LocalDateTime now = LocalDateTime.now();  
			 String format = dtf.format(now);
			  
			
			
			
			driver.findElement(By.xpath("//a[text()='Bootcamp']/../../following-sibling::td[5]")).click();
			
			driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
           driver.findElement(By.xpath("//label[text()='Due Date']/../div/input")).sendKeys(format);
           
           driver.findElement(By.xpath("//span[text()='Priority']/../following-sibling::div/div/div/div/a")).click();
           
           driver.findElement(By.xpath("//a[@title='Low']")).click();
           
           driver.findElement(By.xpath("//button[@title='Save']")).click();
           
           String text = driver.findElement(By.xpath("//span[text()='Task']/../../..")).getText();
           
           
           System.out.println(text);
           
			

	}

}
