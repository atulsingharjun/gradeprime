package framework.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class loginsignup {
	
	
	public	By loginbutton =By.xpath("//span[text()='Log In']");
	public By loginverify =By.xpath("//h3[text()='Welcome to Grade Prime']");
	public By userid = By.xpath("//input[@name='username']");
	public By password =By.xpath("//input[@name='password']");
	public By login= By.xpath("//button[ @type='submit']");
	

}
