package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo {
	
	static WebDriver driver;
	
	public static WebDriver OpenChromeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\krishna core\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		return driver;
			
	}

}
