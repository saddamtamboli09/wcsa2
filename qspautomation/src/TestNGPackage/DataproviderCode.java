package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderCode {
  WebDriver driver;
  @Test
  public void testActiTimeValidLogin(String invalidusername, String invalidpassword) 
  {
	  driver.findElement(By.name("username")).sendKeys(invalidusername);
	  driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
	  driver.findElement(By.id("loginButton")).click();
  }
  @BeforeMethod
  public void setUp()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("http://laptop-4e2uibno/login.do");
	  
  }
  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }
  
  
}
