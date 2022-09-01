package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
//1.description flag
public class Flag1 {
  @Test(description = "This test is used to perform a valid login")
  public void validActiTimeTest() 
  {
	  Reporter.log("valid login is performed",true);
  }
  @Test(description = "This test is used to perform a invalid login")
  public void invalidActiTimeTest()
  {
	  Reporter.log("invalid login is performed",true);
  }
}
