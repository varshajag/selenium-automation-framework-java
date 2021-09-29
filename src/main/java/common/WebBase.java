package common;

import org.testng.annotations.DataProvider;

public class WebBase 
{
	@DataProvider(name="Login Data")
	public String[][] getLoginData()
	{
		
		String loginData[][]= {{"admin","admin123"},{"ess","ess,123"}};
		return loginData;
		
	                 }
}
