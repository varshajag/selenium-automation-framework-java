package common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory
{
	public static ThreadLocal<WebDriver> threadStorage=new ThreadLocal<>();
	

}
