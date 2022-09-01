package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
//4.dependsOnMethods flag
public class Flag4 {
  @Test
  public void actiTimeLogin() 
  {
	  int i=9/0;
	  System.out.println(i);
	  Reporter.log("Login successful",true);
  }
  
  @Test(dependsOnMethods = "actiTimeLogin")
  public void actiTimeCreateUser()
  {
	  Reporter.log("Create User",true);
  }
  
  @Test(dependsOnMethods = "actiTimeCreateuser")
  public void actiTimeLogout()
  {
	  Reporter.log("Logout successful",true);
  }
}
