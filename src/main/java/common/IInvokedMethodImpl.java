package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodImpl implements IInvokedMethodListener {

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult)
	{
		WebDriverFactory.threadStorage.get().quit();
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriverFactory.threadStorage.set(new ChromeDriver());
		WebDriverFactory.threadStorage.get().manage().window().maximize();
		WebDriverFactory.threadStorage.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverFactory.threadStorage.get().get("https://opensource-demo.orangehrmlive.com/");
	}
}
