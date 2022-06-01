package com.FlipKart.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
    private WebDriver driver;
    private Actions act;
    
    @FindBy(xpath="(//div[text()='Top Offers'])[1]")
    private WebElement topOffers;
    public void clickTopOffers()
    {
    	topOffers.click();
    	
    }
    
    @FindBy(xpath="//span[text()='Cart']")
    private WebElement cartButton;
    public void clickCartButton()
    {
    	cartButton.click();
    }
    
   @FindBy(xpath="//div[text()='Bhagvat DHADE']")
   private WebElement menuButton;
   public void mouseAction()
   {
	    //  menuButton.click();
	   act.moveToElement(menuButton).perform();
   }
   
   @FindBy(xpath="//div[text()='Logout']")
   private WebElement logOut;
   public void clickOnLogOutButton() throws InterruptedException
   {
	   //Thread.sleep(2000);
	   logOut.click();  
   }
@FindBy(xpath="(//div[@class='xtXmba'])[5]")
private WebElement electronics;
public void mouseAction2()
{
	act.moveToElement(electronics).perform();
}
 @FindBy(xpath="//a[text()='Bluetooth Headphones']")
 private WebElement blueTooth;
 public void clickBlueToothHeadPhone()
 {
	 blueTooth.click();
 }
   public HomePagePOMClass (WebDriver driver)
   {
	  this.driver = driver; 
	  act = new Actions(driver);
	  
	  PageFactory.initElements(driver, this); 
   }
}
