package com.FlipKart.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.FlipKart.POMClass.HomePagePOMClass;
import com.FlipKart.POMClass.LoginPagePOMClass;

public class TestBaseClass 
{   
	WebDriver driver;
    
	@BeforeClass
	public void setUpBrowser() 
	{
	    System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
   @BeforeMethod
   public void setUplogin()
    {
	   LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	   lp.sendUserName();
	   lp.sendPassword();
	   lp.clickOnLoginButton();
    }
  
   @AfterMethod
   public void tearDownLogOut() throws InterruptedException 
   {
	   HomePagePOMClass hp =new HomePagePOMClass(driver);
		{
			  hp.mouseAction();
			 
			  hp.clickOnLogOutButton();	  
	    }
   }
   @AfterClass
   public void tearDownClose()
   {
	 driver.close();  
   }
	 
	   
}

