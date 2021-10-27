package locators.com;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class locators {
	JavascriptExecutor js;
	@Test
	public void testing() throws InterruptedException {
		 String exePath = "C:\\Users\\jasdeep.singh\\eclipse-workspace\\Software\\chromedriver.exe";
		 
		 System.setProperty("webdriver.chrome.driver", exePath);
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 String webString="https://www.demoqa.com/automation-practice-form";
		 
		 driver.get(webString);
		 
		driver.findElement(By.id("firstName")).sendKeys("Jasdeep");
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.findElement(By.id("userEmail")).sendKeys("j@gmail.com");
		
	
	
//		driver.findElement(By.xpath("//input[@value='Male']")).click();
		//label[@for="gender-radio-1"]
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("label[@for='gender-radio-1']")).click();
		
		
		
		driver.findElement(By.id("userNumber")).sendKeys("8782728172");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		
		
		
		driver.findElement(By.xpath("//div[text()='30']")).click();

		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("math");
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("hobbies-checkbox-1")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\jasdeep.singh\\Downloads\\profile_.jpg");
	
	    driver.findElement(By.id("currentAddress")).sendKeys("Vill-Bahera Joravar , Post-maigal ganj");
	    
	    driver.findElement(By.id("react-select-3-input")).sendKeys("Uttar");
	    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
	    
	    
	    driver.findElement(By.id("react-select-4-input")).sendKeys("agra");
	    driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//button[@id='submit']")).submit();
	    
     
        
	
		
		
		 
		
		
		
	}

}
