package Facebbok;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Login_page {
	
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[text()='Log in']")
	private WebElement Login;
	
	@FindBy (xpath="//a[text()='Forgotten password?']")
	private WebElement forgottenPass;
	
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	public void username()
	{
		 boolean user =username.isDisplayed();
		 System.out.println(user);
		 username.sendKeys("krishna");
	}
	
	public void password ()
	{
		 boolean pass = password.isDisplayed();
		 System.out.println(pass);
		password.sendKeys("Krishna@123");
	}
	
	public void Login() throws InterruptedException
	{
		boolean loginButton =Login.isDisplayed();
		System.out.println(loginButton);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Log in']")));
	//	Login.click();
	}
	
	public void forgottenPassword()
	{
		boolean FP = forgottenPass.isDisplayed();
		System.out.println(FP);
		String FPText=forgottenPass.getText();
		System.out.println(FPText);
		forgottenPass.click();
		
		
	}
	
	

}
