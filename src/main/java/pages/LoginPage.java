package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage 
{
	@FindBy(id="txtUsername")
	private WebElement username;
	@FindBy(id="txtPassword")
	private WebElement password;
	@FindBy(id="btnLogin")
	private WebElement loginbutton;
	@FindBy(id="spanMessage")
	private WebElement errorMessage;
	
	private WebDriverWait wait;
	

public LoginPage()
{
	PageFactory.initElements(WebDriverFactory.threadStorage.get(),this);
	wait=new WebDriverWait (WebDriverFactory.threadStorage.get(),20);
}
public HomePage login(String strUsername,String strPassword)
{
	username.sendKeys(strUsername);
	password.sendKeys(strPassword);
	loginbutton.click();
	
	HomePage hp=new HomePage();
	return hp.isPageLoaded();
}
public void verifyErrorMessage(String strExpectedErrorMessage)
{
	Assert.assertEquals(errorMessage.getText(),strExpectedErrorMessage);
}

}
