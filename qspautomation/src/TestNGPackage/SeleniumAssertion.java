package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumAssertion {
	WebDriver driver;
  @BeforeMethod
  public void setUp()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.selenium.dev/");
  }
  
  @Test
  public void seleniumTest()
  {
	  String homePageTitle = driver.getTitle();
	  SoftAssert softassert = new SoftAssert();
	  //soft assert
	  softassert.assertEquals(homePageTitle, "nothing");
	  Reporter.log("homepage Title is verified",true);
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
