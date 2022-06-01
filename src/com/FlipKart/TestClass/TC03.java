package com.FlipKart.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.FlipKart.POMClass.HomePagePOMClass;

public class TC03 extends TestBaseClass
{
	@Test
	public void singleProductSelect() 
	{
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		//hp.clickTopOffers();
		hp.mouseAction2();
		
		hp.clickBlueToothHeadPhone();
	}
	
	
	
	
	
	
	
}
