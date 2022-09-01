package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
//invocation flag
public class Flag7 {
  @Test(invocationCount = 5000)
  public void f() 
  {
	  Reporter.log("create and delete user",true);
  }
}
