package gradeprime;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import framework.base.configuration;
import framework.pages.loginsignup;
import framework.utils.failcases;

@Test
@Listeners(failcases.class)
public class login extends configuration  { 

	Properties prop =new Properties();
	loginsignup element = new  loginsignup();

	String uid;
	String upassword;
	public login() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\gradeprime\\src\\test\\resources\\credentials.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			System.err.println("Property file not found: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Unable to load properties: " + e.getMessage());
		}
		uid = prop.getProperty("id");
		upassword= prop.getProperty("password");
	}
	
	@Test()
	public void correctlogin() throws InterruptedException {
		validlogin();
		driver.findElement(element.userid).sendKeys(uid);
		driver.findElement(element.password).sendKeys(upassword);
		driver.findElement(element.login).click();
	}
}


