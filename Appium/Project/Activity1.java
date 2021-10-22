package Project;

import java.net.MalformedURLException;
import java.net.URL;

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

public class Activity1 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);

      
    }
    @Test(priority=1)
    public void addtask() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElementByAccessibilityId("Create new task").click();
    	
    	MobileElement NewTask1 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        Thread.sleep(5000);
        NewTask1.sendKeys("Complete Activity with Google Tasks");
        driver.findElementByXPath("//android.widget.Button[@text='Save']").click();
        Thread.sleep(5000);
        String TaskLocator = "resourceId(\"com.google.android.apps.tasks:id/task_name\")";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(TaskLocator)));
        String CreatedTask1 = driver.findElement(MobileBy.AndroidUIAutomator(TaskLocator)).getText();
        Assert.assertEquals(CreatedTask1, "Complete Activity with Google Tasks");
        }
    @Test(priority=2)
    public void addtask2() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElementByAccessibilityId("Create new task").click();
    	Thread.sleep(5000);
    	MobileElement NewTask2 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        Thread.sleep(5000);
        NewTask2.sendKeys("Complete Activity with Google Keep");
        driver.findElementByXPath("//android.widget.Button[@text='Save']").click();
        Thread.sleep(5000);
        String TaskLocator2 = "resourceId(\"com.google.android.apps.tasks:id/task_name\")";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(TaskLocator2)));
        String CreatedTask2 = driver.findElement(MobileBy.AndroidUIAutomator(TaskLocator2)).getText();
        Assert.assertEquals(CreatedTask2, "Complete Activity with Google Keep");
        }
    @Test(priority=3)
    public void addtask3() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElementByAccessibilityId("Create new task").click();
    	Thread.sleep(5000);
    	MobileElement NewTask3 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        Thread.sleep(5000);
        NewTask3.sendKeys("Complete the second Activity Google Keep");
        driver.findElementByXPath("//android.widget.Button[@text='Save']").click();
        Thread.sleep(5000);
        String TaskLocator3 = "resourceId(\"com.google.android.apps.tasks:id/task_name\")";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(TaskLocator3)));
        String CreatedTask3 = driver.findElement(MobileBy.AndroidUIAutomator(TaskLocator3)).getText();
        Assert.assertEquals(CreatedTask3, "Complete the second Activity Google Keep");
        }
    
    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
