package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class AddUserPage
{
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement employeename;
	@FindBy(id="systemUser_userName")
	private WebElement username2;
	@FindBy(id="systemUser_password")
	private WebElement password2;
	@FindBy(id="systemUser_confirmPassword")
	private WebElement confirmpassword;
	@FindBy(id="btnSave")
	private WebElement saveButton;
	
	private WebDriverWait wait;
	
public AddUserPage()
{
	PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
	wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),30);
}

public AdminPage addUser(String strEmployeename,String strUsername,String strPassword,String strConfirmPassword)
{
	employeename.sendKeys(strEmployeename);
	username2.sendKeys(strUsername);
	password2.sendKeys(strPassword);
	confirmpassword.sendKeys(strConfirmPassword);
	saveButton.click();
	
	return new AdminPage();
}
public AddUserPage isLoaded()
{
	wait.until(ExpectedConditions.visibilityOf(employeename));
	wait.until(ExpectedConditions.visibilityOf(username2));
	wait.until(ExpectedConditions.visibilityOf(password2));
	wait.until(ExpectedConditions.visibilityOf(confirmpassword));
	wait.until(ExpectedConditions.visibilityOf(saveButton));
	
	return this;
}


}
