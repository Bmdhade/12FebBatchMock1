package com.FlipKart.TestClass;

import javax.annotation.processing.SupportedSourceVersion;

import org.testng.annotations.Test;

import com.FlipKart.POMClass.HomePagePOMClass;

public class TC02 extends TestBaseClass
{
  @Test
  public void singleProductSelect()
  {
	 HomePagePOMClass hp =new HomePagePOMClass(driver);
	 
	 hp.clickTopOffers(); 
  }
}
