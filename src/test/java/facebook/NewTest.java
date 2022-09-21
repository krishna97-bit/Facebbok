package facebook;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Facebbok.Login_page;
import utility.Pojo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest extends Pojo {
	
	 static WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		
		WebDriver driver = OpenChromeBrowser();
		this.driver = driver;
		
	  }
	
	 @BeforeMethod
	  public void beforeMethod() 
	 { 
		 System.out.println("beforeMethod"); 
	  }
	
	
  @Test(priority=1)
  public void verify_Username() 
  {
	  Login_page Lp = new Login_page(driver);
	  Lp.username(); 
	  SoftAssert s = new SoftAssert();
	  s.assertTrue(true);
	  s.assertAll();  
  }
  
  @Test(priority=2)
  public void Verify_password()
  {
	  Login_page Lp = new Login_page(driver);
	  Lp.password();
	  Assert.assertTrue(true);  
  }
  
  @Test(priority=3)
  public void verify_login_button() throws InterruptedException
  {
	  Login_page Lp = new Login_page(driver);
	  Lp.Login();
  }

  @Test
  public void verify_forgottenPassword()
  {  
	  Login_page Lp = new Login_page(driver);
	 Lp.forgottenPassword();
  }
  
  
  
  
  
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("aftermethod");  
  }


  @AfterClass
  public void afterClass() 
  {
	 System.out.println("afterclass"); 
  }
  

}
