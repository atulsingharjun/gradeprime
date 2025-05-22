package framework.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class loginsignup {
	
	
	public	By loginbutton =By.xpath("//span[text()='Log In']");
	public By loginverify =By.xpath("//h3[text()='Welcome to Grade Prime']");
	public By userid = By.xpath("//input[@name='username']");
	public By password =By.xpath("//input[@name='password']");
	public By login= By.xpath("//button[ @type='submit']");
	public By username=By.xpath("//span[@id='useriddata']");
	public By error =By.xpath("//h2[text()='ERROR']");
	public By logout =By.xpath("//a[normalize-space()='Logout']");
	public By forgot =By.xpath("//p[@class='text_dark1 comicrelief']");
	public By forgotverify =By.xpath("//h2[@class='funsized']");
	public By signup=By.xpath("//a[contains(text(), 'Sign up')]");
	public By signupverify=By.xpath("//h3[normalize-space(text())='Welcome to Grade Prime']");

	public By user =By.xpath("//span[text()=' Add']");
	public By userverify = By.xpath("//p[text()='Users']");
	public By add =By.xpath("//button[.//span[normalize-space()='Add']]");
	public By ausername =By.xpath("//input[@name='username']");
	public By auserid =By.xpath("//input[@name='username']");
	
	
}
