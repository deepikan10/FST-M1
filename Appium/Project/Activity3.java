package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 {
	AppiumDriver<MobileElement>driver= null;
	WebDriverWait wait;
	@BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);

    }
	@Test(priority=1)
	public void addnote() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("New text note").click();
		//Add Note and click back button
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		MobileElement Note1 = driver.findElementByXPath("//android.widget.EditText[@text='Title']");
        Thread.sleep(5000);
        Note1.sendKeys("Appium Training");
        MobileElement Description1 = driver.findElementByXPath("//android.widget.EditText[@text='Note']");
        Thread.sleep(5000);
        Description1.sendKeys("Appium project going on");
        Thread.sleep(5000);
		
		
		//Add reminder
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Reminder").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Pick a date & time']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Save']").click();
		
		
		//Assertion for reminder
		Thread.sleep(5000);
		String Reminder = "resourceId(\"com.google.android.keep:id/browse_reminder_chip\")";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(Reminder)));
        MobileElement Addedreminder = driver.findElement(MobileBy.AndroidUIAutomator(Reminder));
        Assert.assertTrue(Addedreminder.isDisplayed());
        //Saving Note
        Thread.sleep(5000);
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		
		//Assert 
		Thread.sleep(5000);
		String Notelocator = "resourceId(\"com.google.android.keep:id/index_note_title\")";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(Notelocator)));
        String CreatedNote = driver.findElement(MobileBy.AndroidUIAutomator(Notelocator)).getText();
        Assert.assertEquals(CreatedNote, "Appium Training");
        
		
	}
	@AfterClass
    public void afterClass() {
        driver.quit();
    }
	

}

