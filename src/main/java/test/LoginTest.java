package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodImpl;
import common.WebBase;
import pages.LoginPage;

@Listeners(IInvokedMethodImpl.class)
public class LoginTest extends WebBase
{
	@Test(dataProvider="Login Data")
	public void verifyLoginSuccessful(String username,String password)
	{
		LoginPage lp=new LoginPage();
		lp.login(username, password);
		
	}
		
}
