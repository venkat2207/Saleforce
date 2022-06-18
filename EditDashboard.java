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

public class EditDashboard {

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
		
		
		WebElement element = driver.findElement(By.xpath("//mark[text()='Dashboard']/.."));
	     
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    
		executor.executeScript("arguments[0].click();", element);
		

		WebElement elementTwo=driver.findElement(By.xpath("(//span[text()='Dashboards'])[1]/.."));
		
		JavascriptExecutor executorTwo = (JavascriptExecutor)driver;	    
    	executorTwo.executeScript("arguments[0].click();", elementTwo);
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search recent dashboards...']")).sendKeys("venkat",Keys.RETURN);
		
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Show actions'])[6]/ancestor::lightning-primitive-cell-actions")));
//		
		driver.findElement(By.xpath("//table/tbody//th//span[text()='Venkat']/ancestor::th/following-sibling::td[6]//button")).click();
		
		driver.findElement(By.xpath("//span[text()='Edit']//parent::a")).click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		
		driver.switchTo().frame(frame1);
		
		
		WebElement elementOne=driver.findElement(By.xpath("//button[@title='Edit Dashboard Properties']"));
		
		JavascriptExecutor executorOne = (JavascriptExecutor)driver;	    
    	executorOne.executeScript("arguments[0].click();", elementOne);
    	
  	driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Venkat");
//        
//    	
    	driver.findElement(By.id("dashboardDescriptionInput")).clear();
//    	
  	    driver.findElement(By.id("dashboardDescriptionInput")).sendKeys("salesforce");
//    	
  	    
  	    driver.findElement(By.xpath("//span[text()='Me']")).click();
//    	
    	driver.findElement(By.id("submitBtn")).click();
//    	
    	driver.findElement(By.xpath("//button[text()='Done']")).click();
//    	
    	driver.findElement(By.id("modalBtn2")).click();
//    	
    	String text = driver.findElement(By.xpath("//span[contains(text(),'Viewing')]/parent::span/preceding-sibling::div/p")).getText();
//    	
//    	
    	System.out.println(text);
    	
    	if(text.contains("salesforce"))
    	{
    		
    		System.out.println("successfully edited");
    	}
//        
		
		
	
	}

}
