package gradeprime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import framework.base.configuration;

public class login  {
	  configuration config = new configuration(); 
		 WebDriver driver;
	
	@Test
	public void validlogin() {
		 driver =new ChromeDriver();
	
		driver.get(config.link);
		driver.close();
		
	}

}
