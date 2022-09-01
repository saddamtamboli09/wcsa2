package TestNGPackage;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class ActiTimeAsssertion {
	WebDriver driver;
 
  @BeforeMethod
  public void setUp()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("http://laptop-4e2uibno/login.do");
  }
  @Test
  public void ActiTimeTest() throws InterruptedException 
  {
	  String loginPageTitle = driver.getTitle();
	  SoftAssert softassert = new SoftAssert();
	  //softassert
	  softassert.assertEquals(loginPageTitle, "actiTime-Login");
	  Reporter.log("login page title is verified",true);
	  
	  //hard assert
	  
	  boolean statusofusernametextBox = driver.findElement(By.name("username")).isDisplayed();
	  Assert.assertEquals(statusofusernametextBox, true);
	  Reporter.log("username text box is displayed",true);
	  driver.findElement(By.name("username")).sendKeys("admin");
	 //---------------------------------------------------------------
	  
	  //hard assert
	  boolean statusofpasswordtextBox = driver.findElement(By.name("username")).isDisplayed();
	  Assert.assertEquals(statusofpasswordtextBox, true);
	  
	  Reporter.log("password text box is displayed",true);
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	 //--------------------------------------------------------------------
	  
	  //hard assert
	  boolean statusofloginButton = driver.findElement(By.name("username")).isDisplayed();
	  Assert.assertEquals(statusofloginButton, true);
	  Reporter.log("loginButton is displayed",true);
	  driver.findElement(By.name("loginButton")).click();
	//----------------------------------------------------------------
	  
	  Thread.sleep(5000);
	  String homePageTitle = driver.getTitle();
	  softassert.assertEquals(homePageTitle, "actiTime - Enter Time-Track");
	  
	  Reporter.log("Home page title is verified",true);
	  
	  Reporter.log("create user", true);
	  Reporter.log("create reports", true);
	  softassert.assertAll();
  }
  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
  }

}
