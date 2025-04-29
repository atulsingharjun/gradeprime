package framework.base;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class configuration {
   public String link = "https://gradeprime.simplyone.ai/#";  
   public WebDriver driver;
    
   @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
    }
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    // Capture screenshot
   
}
