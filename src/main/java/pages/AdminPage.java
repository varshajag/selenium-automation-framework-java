package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class AdminPage
{
	@FindBy(id="btnAdd")
	private WebElement Addbutton;
	
	private WebDriverWait wait;

public AdminPage()
{
		PageFactory.initElements(WebDriverFactory.threadStorage.get(),this);
		wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),20);
}
public AddUserPage navigatetoAddUserPage()
{
	Addbutton.click();
	return  new AddUserPage().isLoaded();
}
public AdminPage isLoaded()
{
	wait.until(ExpectedConditions.visibilityOf(Addbutton));
	return this;
}

}
