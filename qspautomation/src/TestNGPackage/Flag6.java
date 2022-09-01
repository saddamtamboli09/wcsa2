package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups="FUNCTIONAL")
  public void ft1() 
  {
	  Reporter.log("functional test case 1",true);
  }
  @Test(groups="INTEGRATION")
  public void It1() 
  {
	  Reporter.log("Integration test case 2",true);
  }
  
  @Test(groups="SMOKE")
  public void st1() 
  {
	  Reporter.log("smoke test case 1",true);
  }
//-----------------------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft2() 
  {
	  Reporter.log("functional test case 2",true);
  }
  @Test(groups="INTEGRATION")
  public void It2() 
  {
	  Reporter.log("Integration test case 2",true);
  }
  @Test(groups="SMOKE")
  public void st2() 
  {
	  Reporter.log("smoke test case 2",true);
  }
 //---------------------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft3() 
  {
	  Reporter.log("functional test case 3",true);
  }
  @Test(groups="INTEGRATION")
  public void It3() 
  {
	  Reporter.log("Integration test case 3",true);
  }
  @Test(groups="SMOKE")
  public void st3() 
  {
	  Reporter.log("smoke test case 3",true);
  }
  
 //-----------------------------------------------------------------------------------
 
  
 
}
