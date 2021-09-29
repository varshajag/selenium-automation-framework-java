package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodImpl;
import pages.LoginPage;

@Listeners(IInvokedMethodImpl.class)
public class AddUserTest
{
	@Test
	public void verifyAdminUsergettingAddedSuccessfully()
	{
		LoginPage lp=new LoginPage();
		lp.login("Admin", "admin123")
		
		    .verifyWelcomeText("Welcome Paul")
		      .navigatetoAdminPage()
			     .navigatetoAddUserPage()
		            .addUser("Varsha", "vpjagtap", "vpj123", "vpj123");
		
	}
}
