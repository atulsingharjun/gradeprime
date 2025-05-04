package framework.base;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import framework.pages.loginsignup;
import io.github.bonigarcia.wdm.WebDriverManager;


public class configuration {
	loginsignup element = new  loginsignup();
	public String link = "https://gradeprime.simplyone.ai/#";  
	public WebDriver driver;




	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	public void validlogin() {
		driver.get(link);

		driver.findElement(element.loginbutton).click();
		WebElement elements = driver.findElement(element.loginverify);
		String actualText = elements.getText();
		String expectedText = "Welcome to Grade Prime";
		Assert.assertEquals(actualText, expectedText,"The text on the page does not match the expected value");

	}
	@AfterTest
	public void teardown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

	public void logout() {
		WebElement dropdown =driver.findElement(element.username);
		dropdown.click();
		driver.findElement(element.logout).click();

	}

}
