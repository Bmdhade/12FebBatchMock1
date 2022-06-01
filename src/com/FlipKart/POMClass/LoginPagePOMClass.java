package com.FlipKart.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
   private WebDriver driver;
   
   @FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
   private WebElement userName;
   
   public void sendUserName()
   {
	   userName.sendKeys("7038626747");
   }
   
   @FindBy(xpath="//input[@type='password']")
   private WebElement password;
   public void sendPassword()
   {
	   password.sendKeys("Bhagvat@123"); 
   }
   
   @FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
   private WebElement loginButton;
   public void clickOnLoginButton()
   {
	   loginButton.click(); 
   }
   
   public LoginPagePOMClass (WebDriver driver)
   {
	  this. driver = driver; 
	  PageFactory.initElements(driver, this);
	 
   }
   
   
   
   
   
   
   
   
   
}
