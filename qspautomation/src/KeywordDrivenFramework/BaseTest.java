package KeywordDrivenFramework;

import java.io.IOException;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	public void openBrowser() throws IOException   // to open browser
	{
		Flib flib = new Flib();
		
		//read the browser value
		String browservalue = flib.readPropertFile("./data/config.properties", "browser");
		//read the url
		String url = flib.readPropertFile("./data/config.properties", "url");
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url); 
			
		 }
		
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
			
		 }
		
	}
	//close all the browsers
	public void closeBrowser()
	{
		driver.quit();
	}

}
