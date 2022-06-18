package SalesforceOne;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardSortByName {

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
			
			
			driver.findElement(By.xpath("(//span[text()='Dashboards'])[1]/..")).click();
			
			driver.findElement(By.xpath("//span[text()='Dashboard Name']/parent::a")).click();
			
			List<WebElement> dashboardElementList = driver.findElements(By.xpath("//table/tbody/tr/th//a"));
			
			ArrayList <String> dashboardNameList = new ArrayList<String>();
			
			
			for (WebElement webElement : dashboardElementList) {
	            String name = webElement.getText();
	            dashboardNameList.add(name.toLowerCase());
	        }
		
		
			System.out.println(dashboardNameList);
			
			ArrayList <String> dashboardNameListClone=(ArrayList<String>) dashboardNameList.clone();
			
			//System.out.println(dashboardNameListClone);
            
			
			Collections.sort(dashboardNameListClone);
			
			System.out.println(dashboardNameListClone);
			
			boolean boolval = dashboardNameList.equals(dashboardNameListClone); //returns true because lists are equal  
			System.out.println(boolval); 
			
			
		
	}

}
