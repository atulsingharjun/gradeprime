package gradeprime;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import framework.base.configuration;
import framework.pages.loginsignup;
import framework.utils.failcases;

@Listeners(failcases.class)
public class login extends configuration  { 
	
	 loginsignup element = new  loginsignup();
	@Test(testName="validlogin")
	public void validlogin() {
		 driver.get(link);
	     driver.findElement(element.loginbutton).click();
	     WebElement elements = driver.findElement(element.loginverify);
			String actualText = elements.getText();
			String expectedText = "Welcome to Grade Prime";
			Assert.assertEquals(actualText, expectedText,"The text on the page does not match the expected value");
			
			
	     
	    
	}

}
