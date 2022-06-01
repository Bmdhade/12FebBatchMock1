package com.FlipKart.TestClass;

import org.testng.annotations.Test;

public class TC01 extends TestBaseClass
{
  @Test
  public void LoginFunctionality()
  {
	//validation--
	  
	  String actualTitle = driver.getCurrentUrl();
	  String expectedTitle ="https://www.flipkart.com/";
	  if(actualTitle.equals(expectedTitle))
	  {
		 System.out.println("test case is passed");
	  }
	  		
	  else
	  {
		  System.out.println("test case is failed");
	  }	
	  
	
  }
}
