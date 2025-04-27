package framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class configuration {
	public 	 String link ="https://gradeprime.simplyone.ai/#";
	public WebDriver driver;
	@BeforeTest
	public void setup() {
		
		driver =new ChromeDriver();
		
	}
	@AfterTest
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
		
	}

}
