package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void actiTimeLogin() 
  {
	  int i=9/0;
	  System.out.println(i);
	  Reporter.log("Login successful",true);
  }
  
  
}
