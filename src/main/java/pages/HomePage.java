package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.WebDriverFactory;

public class HomePage 
{
	@FindBy(id="welcome")
	private WebElement welcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement adminTab;
	
	private WebDriverWait wait;
	
public HomePage()
{
	PageFactory.initElements(WebDriverFactory.threadStorage.get(),this);
	wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),20);
}
public HomePage verifyWelcomeText(String strExpectedWelcomeText)
{
	Assert.assertEquals(welcomeText.getText(), strExpectedWelcomeText);
	return new HomePage();
}
public AdminPage navigatetoAdminPage()
{
	adminTab.click();
	return new AdminPage();
}
public HomePage isPageLoaded()
{
	wait.until(ExpectedConditions.visibilityOf(adminTab));
	return this;
}
}
