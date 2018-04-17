package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Alertview {
	public Alertview(IOSDriver<IOSElement> driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(new AppiumFieldDecorator (driver), this);
	}
	
	@iOSFindBy(id="Text Entry")
	public WebElement textEntry;
}
