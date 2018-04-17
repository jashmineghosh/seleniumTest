package basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class practise {
	 static IOSDriver<IOSElement>driver;
	public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {
//	 public static void main(String[] args ) throws MalformedURLException {
		// TODO Auto-generated method stub
		
DesiredCapabilities d = new DesiredCapabilities();
d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
//d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
d.setCapability(MobileCapabilityType.APP,"//Users//arnabbhuiya//Desktop//UICatalog.app");

driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
	}
}