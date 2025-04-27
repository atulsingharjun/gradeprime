package gradeprime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import framework.base.configuration;
import framework.utils.failcases;

@Listeners(failcases.class)
public class login extends configuration  {
	
	    public WebDriver driver;
	    
	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        
	       
	    }
	 
	@Test(testName="validlogin")
	public void validlogin() {
		 
		 driver.get(link);
	     System.out.println("Title is: " + driver.getTitle());
	   
	     driver.findElement(By.xpath(".."));
	    
	}

}
