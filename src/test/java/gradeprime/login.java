package gradeprime;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import framework.base.configuration;
import framework.pages.loginsignup;
import framework.utils.failcases;

@Listeners(failcases.class)
public class login extends configuration {

	Properties prop = new Properties();
	loginsignup element = new loginsignup();
	SoftAssert softAssert = new SoftAssert();
	String uid;
	String upassword;
	String wid;
	String wpassword;

	@BeforeClass
	public void loadCredentials() {
		try (FileInputStream file = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\gradeprime\\src\\test\\resources\\credentials.properties")) {
			prop.load(file);
			uid = prop.getProperty("id");
			upassword = prop.getProperty("password");
			wid=prop.getProperty("wid");
			wpassword=prop.getProperty("wpassword");
		} catch (IOException e) {
			System.err.println("Failed to load properties: " + e.getMessage());
		}
	}

	@Test
	public void correctlogin() throws InterruptedException {
		validlogin(); // Assuming this is defined in your configuration or base class

		driver.findElement(element.userid).sendKeys(uid);
		driver.findElement(element.password).sendKeys(upassword);
		driver.findElement(element.login).click();

		WebElement username = driver.findElement(element.username);
		// assertEquals(username.getText(), "Gradeprime", "Login title text does not match expected.");
		assertTrue(username.getText().equals("Gradeprime"), "Login title text does not match expected.");
		logout();
	}
	@Test
	public void invalidusername() {
		validlogin();
		driver.findElement(element.userid).sendKeys(wid);
		driver.findElement(element.password).sendKeys(upassword);
		driver.findElement(element.login).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(element.error));
		String actualErrorText = errorMessage.getText();
		String expectedErrorText = "ERROR";


		softAssert.assertEquals(actualErrorText, expectedErrorText, "Error message mismatch");

	}
	@Test
	public void invalidpassword() {
		validlogin();
		driver.findElement(element.userid).sendKeys(uid);
		driver.findElement(element.password).sendKeys(wpassword);
		driver.findElement(element.login).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(element.error));
		String actualErrorText = errorMessage.getText();
		String expectedErrorText = "ERROR";
		softAssert.assertEquals(actualErrorText, expectedErrorText, "Error message mismatch");

	}
	@Test
	public void blankfields() {
		validlogin();
		driver.findElement(element.userid);
		driver.findElement(element.password);
		driver.findElement(element.login).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(element.error));
		String actualErrorText = errorMessage.getText();
		String expectedErrorText = "ERROR";
		softAssert.assertEquals(actualErrorText, expectedErrorText, "Error message mismatch");

	}
	@Test
	public void forgotbuttonwithoutid() {
		validlogin();
		driver.findElement(element.forgot).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(element.error));
		String actualErrorText = errorMessage.getText();
		String expectedErrorText = "ERROR";
		softAssert.assertEquals(actualErrorText, expectedErrorText, "Error message mismatch");
	}

	@Test
	public void frgotbuttonwithid() {
		validlogin();
		driver.findElement(element.userid).sendKeys(uid);
		driver.findElement(element.forgot).click();
		WebElement forgotverify= driver.findElement(element.forgotverify);
		assertTrue(forgotverify.getText().equals("Forgot Password"), " Forgot Passwordnot match expected.");

		driver.findElement(By.xpath("//a[contains(text(), 'Home')]")).click();
		


	}
	@Test
	public void signup() {
		validlogin();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Sign up')]")));

		// Scroll into view before clicking
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signupButton);
		signupButton.click();





	}
}
