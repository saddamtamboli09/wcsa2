package TestNGPackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1() {
	  Reporter.log("test 1 method",true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("test 2 method",true); 
  }
  
  @BeforeMethod
  public void method2()
  {
	  Reporter.log("Beforemethod annotation",true);
  }
  
  @BeforeClass
  public void method3()
  {
	  Reporter.log("Beforeclass annotation",true);
  }
  
  @BeforeTest
  public void method4()
  {
	  Reporter.log("BeforeTest annotation",true);
  }
  
  @AfterMethod
  public void method5()
  {
	  Reporter.log("Aftermethod annotation",true);
  }
  
  @AfterClass
  public void method6()
  { 
	  Reporter.log("AfterClass annotation",true);
  }
  @AfterTest
  public void method7()
  {
	  Reporter.log("AfterTest annotation",true); 
  }
}
