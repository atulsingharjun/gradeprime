package gradeprime;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class users extends login{
	
	
	
	
	public void verifyanddd() throws InterruptedException {
		validlogin();
		driver.findElement(element.userid).sendKeys(uid);
		driver.findElement(element.password).sendKeys(upassword);
		driver.findElement(element.login).click();
		

	
			
	
		
	}
	@Test
	public void movetouser() throws InterruptedException {
		verifyanddd();
			
		driver.findElement(element.user).click();
		WebElement userverify = driver.findElement(element.userverify);
		assertTrue(userverify.getText().equals("Users"), "Login title text does not match expected.");
	
		
		
		
	}
	@Test(dependsOnMethods = {"movetouser"})
	public void add() {
		
		//driver.findElement(By.linkText("Add")).click();
		WebElement addBtn = driver.findElement(By.xpath("//button[.//span[normalize-space()='Add']]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addBtn);

	}
	
	public void search() {
		
	}
	 
	public void resetpassword() {
		
	}
	public void opennewtabandverifypassword() {
		
	}
	
	public void delete() {
		
	}

}
