package basic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basiclog4jEx.Logex;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pageObjects.Alertview;
import pageObjects.Home;
import pageObjects.Pickerview;
import testpoi.Excelmac;

public class IOSTest extends practise{
	private static Logger log = LogManager.getLogger(IOSTest.class.getName());
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("resources/log4j2.xml");
		IOSDriver<IOSElement>driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implemented page objects and POI API
		Home h = new Home(driver);
		h.alertView.click();
		log.debug("debugging from project file"); //log4j implemented here 
//		driver.findElementByAccessibilityId("Alert Views").click();
		
		Alertview a = new Alertview(driver);
		a.textEntry.click();
//		driver.findElementByAccessibilityId("Text Entry").click();
		Excelmac ex = new Excelmac();
//		ex.getCelldata(1, 1);
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys(ex.getCelldata(1, 1));
//		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("helloe");
		
		driver.findElementByName("OK").click();
		driver.navigate().back();
		// Get the size of screen.
//		Dimension size = driver.manage().window().getSize();
//		// Find vertical point where you wants to swipe. It is in middle of
//		// screen height.
//		int x = size.getWidth() / 2;
//		// Find swipe start and end point from screen's with and height.
//		// Find startx point which is at right side of screen.
//		int starty = (int) (size.getHeight() * 0.60);
//		// Find endx point which is at left side of screen.
//		int endy = (int) (size.getHeight() * 0.10);
//		// Swipe from Left to Right.
//		driver.swipe(x, starty, x, endy, 2000);
//		driver.findElementByAccessibilityId("Steppers").click();
//		driver.findElementByXPath("(//XCUIElementTypeButton[@name='Increment'])[1]").click();
//		driver.findElementByXPath("(//XCUIElementTypeButton[@name='Increment'])[1]").click();
//		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(0).getText());
//		System.out.println(driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"DEFAULT\"])[2]").getText());
//		driver.navigate().back();
//		driver.findElementByAccessibilityId("Picker View").click();
//		driver.findElementByXPath("(//XCUIElementTypePickerWheel[@label='Red color component value'])").sendKeys("70");
//		driver.findElementByAccessibilityId("Green color component value").sendKeys("200");
//		Pickerview p = new Pickerview(driver);
//		p.pickerviewbutton.get(2).sendKeys("130");		
//		driver.findElementsByClassName("XCUIElementTypePickerWheel").get(2).sendKeys("130");
//		driver.navigate().back();
//		driver.findElementByAccessibilityId("Sliders").click();
//		System.out.println(driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"TINTED\"])[2]").getText());
//		   driver.findElements(By.className("XCUIElementTypeSlider")).get(1).click();
//		WebElement slider =  driver.findElements(By.className("XCUIElementTypeSlider")).get(1);
//		slider.sendKeys("0.1");
//		int startX= slider.getLocation().getX();
//		int endX= slider.getSize().getWidth();
//		int yAxis = slider.getLocation().getY();
//		int moveToXDirectionAt = (int) (endX * 0.1);
//		TouchAction act=new TouchAction(driver);
//		act.press(startX,yAxis).moveTo(moveToXDirectionAt,yAxis).release().perform();
//		driver.findElementsByClassName("XCUIElementTypeSlider").get(1).sendKeys("0.1");
//		driver.performTouchAction(new TouchAction(driver).press(slider).moveTo(20, slider.getLocation().getX()).release().perform());
//		driver.findElementsByClassName("XCUIElementTypeSlider").get(1).setValue("100%");
//		System.out.println(driver.findElementsByClassName("XCUIElementTypeSlider").get(1).getText());
		
	}

}
