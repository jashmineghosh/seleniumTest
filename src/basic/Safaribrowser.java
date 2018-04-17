package basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Safaribrowser {
//	static IOSDriver<IOSElement>driver;
	@Test
	public void browser() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
//		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		dc.setCapability("deviceName", "iPhone 8 Plus");
		dc.setCapability("platformName", "iOS");
		dc.setCapability("platformVersion", "11.3");
		dc.setCapability(CapabilityType.BROWSER_NAME, "safari");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		
//		RemoteWebDriver wd = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
//		driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"),dc);
		

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElementById("identifierId").sendKeys("jashmineghosh@gmail.com");
		driver.findElementByXPath("//*[@id=\"identifierNext\"]/content/span").click();
		WebElement pwd = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
		pwd.sendKeys("123");
		driver.findElementById("passwordNext").click();
		
	}
}
