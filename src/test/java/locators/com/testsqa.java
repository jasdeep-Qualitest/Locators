package locators.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testsqa {
	
	@Test
	public void testing() throws InterruptedException {
		 String exePath = "C:\\Users\\jasdeep.singh\\eclipse-workspace\\Software\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 String webString="https://www.demoqa.com/automation-practice-form";
		 
		 driver.get(webString);
	}

}
